package receiver;

public class AC{
    boolean isOn;
    int temperature;

    public AC() {
        this.isOn = true;
        this.temperature = 24;
    }

    
    public void turnOnAC(){
        this.isOn = true;
        System.out.println("AC is turned ON");
    }

    public void turnOffAC(){
        this.isOn = false;
        System.out.println("AC is turned OFF");
    }

    public void increaseTemperature(){
        this.temperature += 1;
        System.out.println("Temperature Increased. Set To " + this.temperature);
    }

    public void decreaseTemperature(){
        this.temperature -= 1;
        System.out.println("Temperature Decreased. Set To " + this.temperature);
    }
}