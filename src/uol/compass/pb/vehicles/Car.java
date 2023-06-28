package uol.compass.pb.vehicles;

import java.util.List;

public class Car extends Vehicle {
	private boolean airConditioning;
	private boolean radio;

	public Car(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels, boolean airConditioning, boolean radio) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.setAirConditioning(airConditioning);
		this.setRadio(radio);
	}

	public Car() {
		super();
	}

	public boolean hasAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public boolean hasRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Car [hasAirConditioning()=" + hasAirConditioning() + ", hasRadio()=" + hasRadio() + ", getBrand()="
				+ getBrand() + ", getModel()=" + getModel() + ", getModelYear()=" + getModelYear() + ", hasEngine()="
				+ hasEngine() + ", hasSteeringWheel()=" + hasSteeringWheel() + ", getPassengerCount()="
				+ getPassengerCount() + ", getDoorCount()=" + getDoorCount() + ", getWheelCount()=" + getWheelCount()
				+ ", isCargoVehicle()=" + isCargoVehicle() + ", getCargoCapacity()=" + getCargoCapacity()
				+ ", getFuels()=" + getFuels() + "]";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + "," + hasAirConditioning() + "," + hasRadio();
	}
}
