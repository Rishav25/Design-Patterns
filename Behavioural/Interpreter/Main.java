import Context.Context;
import Interpreter.BinaryExpression;
import Interpreter.InterpreterI;
import Interpreter.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.putValue("a", 10);
        context.putValue("b", 20);
        context.putValue("c", 5);
        context.putValue("d", 30);

        InterpreterI tExpression1 = new TerminalExpression("a");
        InterpreterI tExpression2 = new TerminalExpression("b");
        InterpreterI tExpression3 = new TerminalExpression("c");
        InterpreterI tExpression4 = new TerminalExpression("d");

        InterpreterI bExpression1 = new BinaryExpression(tExpression1, tExpression2, '+');
        InterpreterI bExpression2 = new BinaryExpression(tExpression3, tExpression4, '*');

        InterpreterI bExpression3 = new BinaryExpression(bExpression1, bExpression2, '*');

        System.out.println("Value of bExpression1 = " + bExpression1.interpret(context));
        System.out.println("Value of bExpression2 = " + bExpression2.interpret(context));
        System.out.println("Value of bExpression3 = " + bExpression3.interpret(context));
    }
}
