package command;

import receiver.AC;

public class TurnOffACCommand implements CommandI{
    AC ac;

    public TurnOffACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void executeCommand(){
        ac.turnOffAC();
    }

    @Override
    public void undoCommand(){
        ac.turnOnAC();
    }
}
