package uol.compass.pb.vehicles;

import java.util.List;

public class Motorcycle extends Vehicle {
    private boolean electricStart;

    public Motorcycle(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels, boolean electricStart) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.setElectricStart(electricStart);
	}
    
	public Motorcycle() {
		super();
	}

	public boolean hasElectricStart() {
        return electricStart;
    }

    public void setElectricStart(boolean electricStart) {
        this.electricStart = electricStart;
    }

	@Override
	public String toString() {
		return "Motorcycle [hasElectricStart()=" + hasElectricStart() + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getModelYear()=" + getModelYear() + ", hasEngine()=" + hasEngine()
				+ ", hasSteeringWheel()=" + hasSteeringWheel() + ", getPassengerCount()=" + getPassengerCount()
				+ ", getDoorCount()=" + getDoorCount() + ", getWheelCount()=" + getWheelCount() + ", isCargoVehicle()="
				+ isCargoVehicle() + ", getCargoCapacity()=" + getCargoCapacity() + ", getFuels()=" + getFuels() + "]";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + "," + hasElectricStart();
	}
}
