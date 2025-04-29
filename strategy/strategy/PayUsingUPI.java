package strategy;

public class PayUsingUPI implements PaymentStrategy{

    String upiId;
    
    public PayUsingUPI(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using UPI " + upiId);
    }
}