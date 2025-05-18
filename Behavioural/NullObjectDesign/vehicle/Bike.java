package vehicle;

public class Bike implements VehicleInterface{
    @Override
    public int getTopSpeed(){
        return 300;
    }
    @Override
    public int getSeatingCapacity(){
        return 2;
    }
}