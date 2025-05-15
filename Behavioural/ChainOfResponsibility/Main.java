public class Main {
    public static void main(String[] args) {
        // creating the chain here
        // InfoLogger -> DebugLogger -> ErrorLogger
        // whichever satisfies the condition, will execute the logic and if not it will call the super's log which sends the execution to the next step
        // constrcutor has the nextObject of the chain
        SuperLogger logObj = new InfoLogger(new DebugLogger(new ErrorLogger( null )));

        // since static field, we access directly using the className
        logObj.log(SuperLogger.INFO, "This should be an information");
        logObj.log(SuperLogger.ERROR, "This should be an error");
        logObj.log(SuperLogger.ERROR, "This should also be an error");
        logObj.log(SuperLogger.DEBUG, "This is a debug message");

    }
}
