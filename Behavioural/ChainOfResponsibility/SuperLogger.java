public abstract class SuperLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    //here we have the nextLogger as it is USED in the file
    SuperLogger nextLogger;

    // we construct the object and link the nextExecuter to the current one
    public SuperLogger(SuperLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // this function is called if the concrete class cannot fulfill the requirement, it enables us to send the execution to the next step
    public void log(int level, String message){
        if(this.nextLogger != null){
            nextLogger.log(level, message);
        }
    }
    
}
