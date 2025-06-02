package invoker;

import java.util.Stack;

import command.CommandI;

public class ACRemote{
    Stack<CommandI> commandsStack;
    CommandI command;

    public ACRemote() {
        this.commandsStack = new Stack<>();
    }

    public void setCommand(CommandI command){
        this.command = command;
    }

    public void pressButton(){
        command.executeCommand();
        commandsStack.push(command);
    }

    public void undoCommand(){
        if(!commandsStack.isEmpty()){
            System.out.print("Undo Called ");
            CommandI lastCommand = commandsStack.pop();
            lastCommand.undoCommand();
        }
    }
    
}