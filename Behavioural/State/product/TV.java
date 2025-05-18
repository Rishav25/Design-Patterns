package product;

import states.StateInterface;
import states.StateOff;

public class TV {
    
    StateInterface tvState;

    public TV() {
        this.tvState = new StateOff();
    }

    public StateInterface getTvState(){
        return this.tvState;
    }

    public void setTvState(StateInterface state){
        this.tvState = state;
    }
}
