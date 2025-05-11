package context;

import strategy.PaymentStrategy;

public class Cart{
    PaymentStrategy paymentStrategy;
    int cartTotal;

    public Cart(int cartTotal){
        this.cartTotal = cartTotal;
    }

    public void checkout(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(cartTotal);
    }
}