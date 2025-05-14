package vehicleFactory;

import vehicleobject.VehicleInterface;

public interface VehicleFactoryInterface{
    public VehicleInterface createVehicle(String vehicleModel);
}
