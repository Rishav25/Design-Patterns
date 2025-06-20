package Payment;

public abstract class PaymentAbstractClass {
    public abstract void debitFromSource();
    public abstract void creditToTarget();
    public abstract void giveConfirmation();

    // mentioning order of steps here
    public final void sendMoney(){
        debitFromSource();
        creditToTarget();
        giveConfirmation();
    }
}
