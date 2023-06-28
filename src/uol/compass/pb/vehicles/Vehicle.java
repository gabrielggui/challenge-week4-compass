package uol.compass.pb.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private String brand;
	private String model;
	private String modelYear;
	private boolean hasEngine;
	private boolean hasSteeringWheel;
	private int passengerCount;
	private int doorCount;
	private int wheelCount;
	private boolean isCargoVehicle;
	private double cargoCapacity;
	private List<Fuel> fuels;

	public Vehicle(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels) {
		this.setBrand(brand);
		this.setModel(model);
		this.setModelYear(modelYear);
		this.setEngine(hasEngine);
		this.setSteeringWheel(hasSteeringWheel);
		this.setPassengerCount(passengerCount);
		this.setDoorCount(doorCount);
		this.setWheelCount(wheelCount);
		this.setCargoVehicle(isCargoVehicle);
		this.setCargoCapacity(cargoCapacity);
		this.setFuels(fuels);
	}

	public Vehicle() {
		super();
		this.setFuels(new ArrayList<Fuel>());
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public boolean hasEngine() {
		return hasEngine;
	}

	public void setEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public boolean hasSteeringWheel() {
		return hasSteeringWheel;
	}

	public void setSteeringWheel(boolean hasSteeringWheel) {
		this.hasSteeringWheel = hasSteeringWheel;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		if (passengerCount < 0)
			throw new IllegalArgumentException("Passenger count cannot be less than zero.");

		this.passengerCount = passengerCount;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		if (doorCount < 0)
			throw new IllegalArgumentException("Door count cannot be less than zero.");

		this.doorCount = doorCount;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		if (wheelCount < 0)
			throw new IllegalArgumentException("Wheel count cannot be less than zero.");

		this.wheelCount = wheelCount;
	}

	public boolean isCargoVehicle() {
		return isCargoVehicle;
	}

	public void setCargoVehicle(boolean isCargoVehicle) {
		this.isCargoVehicle = isCargoVehicle;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		if (cargoCapacity < 0.0)
			throw new IllegalArgumentException("Cargo capacity cannot be less than zero.");

		this.cargoCapacity = cargoCapacity;
	}

	public List<Fuel> getFuels() {
		return fuels;
	}

	public void setFuels(List<Fuel> fuels) {
		this.fuels = fuels;
	}

	@Override
	public String toString() {
		return "Vehicle [getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getModelYear()=" + getModelYear()
				+ ", hasEngine()=" + hasEngine() + ", hasSteeringWheel()=" + hasSteeringWheel()
				+ ", getPassengerCount()=" + getPassengerCount() + ", getDoorCount()=" + getDoorCount()
				+ ", getWheelCount()=" + getWheelCount() + ", isCargoVehicle()=" + isCargoVehicle()
				+ ", getCargoCapacity()=" + getCargoCapacity() + ", getFuels()=" + getFuels() + "]";
	}
	
	public String toCSV() {
		return getBrand() + "," + getModel() + "," + getModelYear()	+ "," + hasEngine() + "," + hasSteeringWheel()
		+ "," + getPassengerCount() + "," + getDoorCount() + "," + getWheelCount() + "," + isCargoVehicle()
		+ "," + getCargoCapacity() + "," + getFuels();
	}

}
