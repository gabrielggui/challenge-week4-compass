package uol.compass.pb.vehicles;

import java.util.List;

public class Bicycle extends Vehicle {
	/* private boolean electric; */
	private boolean luggageCarrier;

	public Bicycle(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels, boolean electric, boolean luggageCarrier) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.setLuggageCarrier(luggageCarrier);
	}

	public Bicycle() {
		super();
	}

	/*
	 * public boolean isElectric() { return electric; }
	 * 
	 * public void setElectric(boolean electric) { this.electric = electric; }
	 */
	public boolean hasLuggageCarrier() {
		return luggageCarrier;
	}

	public void setLuggageCarrier(boolean luggageCarrier) {
		this.luggageCarrier = luggageCarrier;
	}

	@Override
	public String toString() {
		return "Bicycle [hasLuggageCarrier()=" + hasLuggageCarrier() + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getModelYear()=" + getModelYear() + ", hasEngine()=" + hasEngine()
				+ ", hasSteeringWheel()=" + hasSteeringWheel() + ", getPassengerCount()=" + getPassengerCount()
				+ ", getDoorCount()=" + getDoorCount() + ", getWheelCount()=" + getWheelCount() + ", isCargoVehicle()="
				+ isCargoVehicle() + ", getCargoCapacity()=" + getCargoCapacity() + ", getFuels()=" + getFuels() + "]";
	}

	@Override
	public String toCSV() {
		return super.toCSV() + "," + hasLuggageCarrier();
	}

}
