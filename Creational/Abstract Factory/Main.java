import vehicleobject.VehicleInterface;
import vehicleFactory.VehicleSuperFactory;

public class Main {
    public static void main(String[] args) {
        VehicleSuperFactory vhFactory = new VehicleSuperFactory();
        VehicleInterface vh1 = vhFactory.createVehicle("LUXURY", "BMW");
        VehicleInterface vh2 = vhFactory.createVehicle("NORMAL", "SWIFT");
        VehicleInterface vh3 = vhFactory.createVehicle("LUXURY", "MERCEDES");
        
        System.out.println(vh1.topSpeed());
        System.out.println(vh2.topSpeed());
        System.out.println(vh3.topSpeed());
    }
}
