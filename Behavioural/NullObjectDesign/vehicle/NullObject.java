package vehicle;

public class NullObject implements VehicleInterface{
    @Override
    public int getTopSpeed(){
        return 0;
    }
    @Override
    public int getSeatingCapacity(){
        return 0;
    }
}
