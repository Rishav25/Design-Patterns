package states;

import product.TV;

public class StateOn implements StateInterface{
    @Override
    public void changeVolume(int volume, TV tv) throws Exception{
        System.out.println("Volume changed to : " +volume);
    }
    @Override
    public void changeChannel(int channelNumber, TV tv) throws Exception{
        System.out.println("Channel changed to : " + channelNumber);
    }
    @Override
    public void pressOffButton(TV tv) throws Exception{
        System.out.println("TV Switched OFF");
        tv.setTvState(new StateOff());
    }
    
    @Override
    public void pressOnButton(TV tv) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
}
