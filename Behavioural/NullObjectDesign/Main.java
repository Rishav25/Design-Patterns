import vehicle.*;
import vehicleFactory.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        VehicleInterface vehicle1 = vehicleFactory.createVehicle("CAR");
        System.out.println(vehicle1.getTopSpeed());
        System.out.println(vehicle1.getSeatingCapacity());
        
        // Null case handled here
        VehicleInterface vehicle2 = vehicleFactory.createVehicle("PLANE");
        System.out.println(vehicle2.getTopSpeed());
        System.out.println(vehicle2.getSeatingCapacity());
    }
}
