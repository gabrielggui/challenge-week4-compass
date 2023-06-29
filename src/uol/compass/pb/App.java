package uol.compass.pb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import uol.compass.pb.vehicles.Bicycle;
import uol.compass.pb.vehicles.Car;
import uol.compass.pb.vehicles.Charrete;
import uol.compass.pb.vehicles.Fuel;
import uol.compass.pb.vehicles.Motorcycle;
import uol.compass.pb.vehicles.Truck;
import uol.compass.pb.vehicles.Vehicle;

public class App {

    static List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int option = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("--------------------------");
                System.out.println("-- VEHICLE REGISTRATION --");
                System.out.println("--------------------------");
                System.out.println("Select an option: ");
                System.out.println("");
                System.out.println("1: Register vehicle");
                System.out.println("2: List vehicles");
                System.out.println("3: Save vehicles to CSV file");
                System.out.println("0: Exit");
                System.out.print("-> ");

                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        registerVehicle();
                        break;
                    case 2:
                        displayVehicles();
                        break;
                    case 3:
                        saveListToCSV();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            } while (option != 0);
        } catch (InputMismatchException e) {
            System.err.println("Invalid character!");
        }
    }

    private static void saveListToCSV() {
        System.out.println("-> Select the directory <-");
        String path = selectDirectory();
        if (path != null) {
            SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd HH-mm-ss-S");
            String fileName = path + "\\Vehicles - " + date.format(new Date()) + ".csv";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

                for (Vehicle vehicle : vehicles) {
                    writer.write(vehicle.toCSV() + "\n");
                }

                System.out.println("File saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Directory not selected");
        }
    }

    private static String selectDirectory() {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION)
            return fileChooser.getSelectedFile().getAbsolutePath();

        return null;
    }

    private static void registerVehicle() {
        System.out.println();
        System.out.println("Generating random vehicle...");

        List<String> brands = Arrays.asList("Volkswagen", "Toyota", "Ford", "Chevrolet", "Honda", "BMW",
                "Mercedes-Benz", "Audi", "Nissan", "Hyundai", "Kia", "Mazda", "Subaru", "Volvo", "Fiat", "Renault",
                "Peugeot", "Jeep", "Land Rover", "Lamborghini");

        String brand = brands.get((int) (Math.random() * brands.size()));
        String model = brand.charAt(0) + "-" + (int) (Math.random() * 100000 + 1000);
        Vehicle vehicle = null;

        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0:
                Bicycle bicycle = new Bicycle();
                bicycle.setLuggageCarrier(true);

                vehicle = bicycle;
                break;

            case 1:
                Car car = new Car();
                car.setAirConditioning(true);
                car.setRadio(false);

                vehicle = car;
                break;

            case 2:
                vehicle = new Charrete();
                break;

            case 3:
                Motorcycle motorcycle = new Motorcycle();
                motorcycle.setElectricStart(true);

                vehicle = motorcycle;
                break;

            case 4:
                Truck truck = new Truck();
                truck.setNumberOfAxles(3);

                vehicle = truck;
                break;
        }

        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setModelYear((int) (Math.random() * 33 + 1990) + "");
        vehicle.setEngine(true);
        vehicle.setSteeringWheel(true);
        vehicle.setPassengerCount(4);
        vehicle.setDoorCount(4);
        vehicle.setWheelCount(4);
        vehicle.setCargoVehicle(false);
        vehicle.setCargoCapacity(0.0);
        vehicle.setFuels(null);
        vehicle.setFuels(Arrays.asList(Fuel.values()[(int) (Math.random() * 4)]));

        vehicles.add(vehicle);
    }

    private static void displayVehicles() {
        vehicles.forEach(vehicle -> {
            if (vehicle instanceof Bicycle)
                System.out.println((Bicycle) vehicle);
            else if (vehicle instanceof Car)
                System.out.println((Car) vehicle);
            else if (vehicle instanceof Charrete)
                System.out.println((Charrete) vehicle);
            else if (vehicle instanceof Motorcycle)
                System.out.println((Motorcycle) vehicle);
            else if (vehicle instanceof Truck)
                System.out.println((Truck) vehicle);
        });
    }
}
