package command;

import receiver.AC;

public class TurnOnACCommand implements CommandI{
    AC ac;

    public TurnOnACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void executeCommand(){
        ac.turnOnAC();
    }

    @Override
    public void undoCommand(){
        ac.turnOffAC();
    }
}
