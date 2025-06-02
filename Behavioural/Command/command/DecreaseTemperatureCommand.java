package command;

import receiver.AC;

public class DecreaseTemperatureCommand implements CommandI{
    AC ac;

    public DecreaseTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void executeCommand(){
        ac.decreaseTemperature();
    }

    @Override
    public void undoCommand(){
        ac.increaseTemperature();
    }
}
