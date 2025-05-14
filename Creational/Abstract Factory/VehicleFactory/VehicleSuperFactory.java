package vehicleFactory;

import vehicleobject.VehicleInterface;

public class VehicleSuperFactory {
    // return the specific factory object from the superFactory
    public VehicleInterface createVehicle(String vehicleType, String vehicleModel){
        switch (vehicleType) {
            case "LUXURY" -> {
                return new VehicleFactoryLuxury().createVehicle(vehicleModel);
            }
            case "NORMAL" -> {
                return new VehicleFactoryNormal().createVehicle(vehicleModel);
            }
            default -> throw new AssertionError();
        }
    }
}
