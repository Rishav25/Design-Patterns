package command;

import receiver.AC;

public class IncreaseTemperatureCommand implements CommandI{
    AC ac;

    public IncreaseTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void executeCommand(){
        ac.increaseTemperature();
    }

    @Override
    public void undoCommand(){
        ac.decreaseTemperature();
    }
}
