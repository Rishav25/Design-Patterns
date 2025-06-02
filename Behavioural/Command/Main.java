import command.*;
import invoker.ACRemote;
import receiver.AC;

public class Main{
    public static void main(String[] args) {
        AC ac = new AC();
        ACRemote acRemote = new ACRemote();

        acRemote.setCommand(new TurnOffACCommand(ac));
        acRemote.pressButton();
        acRemote.undoCommand();

        acRemote.setCommand(new IncreaseTemperatureCommand(ac));
        acRemote.pressButton();
        acRemote.setCommand(new IncreaseTemperatureCommand(ac));
        acRemote.pressButton();
        acRemote.setCommand(new IncreaseTemperatureCommand(ac));
        acRemote.pressButton();

        acRemote.undoCommand();
        acRemote.undoCommand();

    }
}