package vehicleFactory;

import vehicleobject.VehicleI10;
import vehicleobject.VehicleInterface;
import vehicleobject.VehicleSwift;

public class VehicleFactoryNormal implements VehicleFactoryInterface{
    @Override
    public VehicleInterface createVehicle(String vehicleModel){
        switch (vehicleModel) {
            case "SWIFT" -> {
                return new VehicleSwift();
            }
            case "I10" -> {
                return new VehicleI10();
            }
            default -> throw new AssertionError();
        }
    }
}
