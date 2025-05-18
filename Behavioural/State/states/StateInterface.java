package states;

import product.TV;

public interface StateInterface {
    public void pressOnButton(TV tv) throws Exception;
    public void changeChannel(int channelNumber, TV tv) throws Exception;
    public void changeVolume(int volumeLevel, TV tv) throws Exception;
    public void pressOffButton(TV tv) throws Exception;
}
