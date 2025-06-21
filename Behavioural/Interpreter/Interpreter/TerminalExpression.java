package Interpreter;

import Context.Context;

public class TerminalExpression implements InterpreterI{

    String key;

    public TerminalExpression(String key) {
        this.key = key;
    }

    @Override
    public Integer interpret(Context context){
        return context.getValue(key);
    }
    
}
