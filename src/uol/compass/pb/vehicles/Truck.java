package uol.compass.pb.vehicles;

import java.util.List;

public class Truck extends Vehicle {
    private double numberOfAxles;

    public Truck(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels, double numberOfAxles) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.setNumberOfAxles(numberOfAxles);
	}

    public Truck() {
		super();
	}

	public double getNumberOfAxles() {
        return numberOfAxles;
    }

	public void setNumberOfAxles(double numberOfAxles) {
        if (numberOfAxles < 2)
            throw new IllegalArgumentException("Number of axles cannot be less than two.");

        this.numberOfAxles = numberOfAxles;
    }

	@Override
	public String toString() {
		return "Truck [getNumberOfAxles()=" + getNumberOfAxles() + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getModelYear()=" + getModelYear() + ", hasEngine()=" + hasEngine()
				+ ", hasSteeringWheel()=" + hasSteeringWheel() + ", getPassengerCount()=" + getPassengerCount()
				+ ", getDoorCount()=" + getDoorCount() + ", getWheelCount()=" + getWheelCount() + ", isCargoVehicle()="
				+ isCargoVehicle() + ", getCargoCapacity()=" + getCargoCapacity() + ", getFuels()=" + getFuels()+ "]";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + "," + getNumberOfAxles();
	}
	
}
