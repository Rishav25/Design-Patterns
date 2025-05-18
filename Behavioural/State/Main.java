import product.TV;
import states.StateInterface;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        StateInterface tvState = tv.getTvState();

        // in reality we will not do anything like this
        // this is to get the series of results
        // while programming, we should use one try catch

        try {
            tvState.changeChannel(45, tv);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            tvState.changeVolume(100, tv);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            tvState.pressOnButton(tv);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        tvState = tv.getTvState();

        try {
            tvState.changeChannel(22, tv);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {
            tvState.pressOffButton(tv);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        
    
    }
}
