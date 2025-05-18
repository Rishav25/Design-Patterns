package vehicleFactory;

import vehicle.*;

public class VehicleFactory {

    public VehicleInterface createVehicle(String vehicleType){
        switch (vehicleType) {
            case "CAR" -> {
                return new Car();
            }
            case "BIKE" -> {
                return new Bike();
            }
            default -> {
                return new NullObject();
            }
        }
    }
    
}
