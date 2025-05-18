package vehicle;

public class Car implements VehicleInterface{
    @Override
    public int getTopSpeed(){
        return 200;
    }
    @Override
    public int getSeatingCapacity(){
        return 4;
    }
}
