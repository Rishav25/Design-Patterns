package states;

import product.TV;
import states.StateOn;

public class StateOff implements StateInterface{
    @Override
    public void pressOnButton(TV tv) throws Exception{
        System.out.println("TV Switched ON");
        tv.setTvState(new StateOn());
    }
    @Override
    public void changeVolume(int volume, TV tv) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    @Override
    public void changeChannel(int channelNumber, TV tv) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    @Override
    public void pressOffButton(TV tv) throws Exception{
        throw new Exception("Cannot perform this operation");
    } 
}
