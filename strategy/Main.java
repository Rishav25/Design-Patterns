import strategy.PayUsingCash;
import strategy.PayUsingUPI;
import context.Cart;

class Main{
    public static void main(String[] args) {
        Cart c1 = new Cart(15000);
        c1.checkout(new PayUsingUPI("rishav@upi"));
        c1.checkout(new PayUsingCash());
    }
}