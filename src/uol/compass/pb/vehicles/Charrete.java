package uol.compass.pb.vehicles;

import java.util.List;

public class Charrete extends Vehicle {

	public Charrete(String brand, String model, String modelYear, boolean hasEngine, boolean hasSteeringWheel,
			int passengerCount, int doorCount, int wheelCount, boolean isCargoVehicle, double cargoCapacity,
			List<Fuel> fuels) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
	}

	public Charrete() {
		super();
	}

}
