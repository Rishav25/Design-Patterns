public class InfoLogger extends SuperLogger{
    public InfoLogger(SuperLogger nextLogger){
        super(nextLogger);
    }

    // here, if the level is DEBUG then we print, else we call the super function
    // since DEBUG is a public static variable, we can use it directly here
    @Override
    public void log(int level, String message){
        if(level == INFO){
            System.out.println("INFO: "+message);
        }
        else{
            super.log(level, message);
        }
    }
}