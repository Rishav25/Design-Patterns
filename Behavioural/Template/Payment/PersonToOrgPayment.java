package Payment;

public class PersonToOrgPayment extends PaymentAbstractClass{
    
    @Override
    public void debitFromSource(){
        System.out.println("Debited from Person");
    }

    @Override
    public void creditToTarget(){
        System.out.println("Credited to Organization");
    }

    @Override
    public void giveConfirmation(){
        System.err.println("Person to Organization Payment Successful");
    }

}
