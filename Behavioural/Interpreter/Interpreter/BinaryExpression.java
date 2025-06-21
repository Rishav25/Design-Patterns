package Interpreter;

import Context.Context;

public class BinaryExpression implements InterpreterI{
    
    InterpreterI leftExpression;
    InterpreterI rightExpression;
    char operation;

    public BinaryExpression(InterpreterI leftExpression, InterpreterI rightExpression, char operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }


    // here we use the concept of recursion.
    // we have a leftexpression and a right expression which can be of InterpreterI type
    // this includes both terminal and nonterminal expressions
    // in the interpret of the non terminal one, we perform operations based on the operation on the value which we get from the interpreter of the expression.
    @Override
    public Integer interpret(Context context){

        switch (operation) {
            case '+' -> {
                return leftExpression.interpret(context) + rightExpression.interpret(context);
            }
            case '-' -> {
                return leftExpression.interpret(context) - rightExpression.interpret(context);
            }
            case '*' -> {
                return leftExpression.interpret(context) * rightExpression.interpret(context);
            }
            case '/' -> {
                return leftExpression.interpret(context) / rightExpression.interpret(context);
            }
            default -> throw new AssertionError();
        }

    }

}
