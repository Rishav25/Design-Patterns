package strategy;

public class PayUsingCash implements PaymentStrategy{

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using Cash ");
    }
}