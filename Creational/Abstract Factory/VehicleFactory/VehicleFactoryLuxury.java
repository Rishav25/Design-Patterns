package vehicleFactory;

import vehicleobject.VehicleInterface;
import vehicleobject.VehicleMercedes;
import vehicleobject.VehicleBMW;

public class VehicleFactoryLuxury implements VehicleFactoryInterface{
    @Override
    public VehicleInterface createVehicle(String vehicleModel){
        switch (vehicleModel) {
            case "MERCEDES" -> {
                return new VehicleMercedes();
            }
            case "BMW" -> {
                return new VehicleBMW();
            }
            default -> throw new AssertionError();
        }
    }
}
