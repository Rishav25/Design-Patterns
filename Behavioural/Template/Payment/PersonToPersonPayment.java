package Payment;

public class PersonToPersonPayment extends PaymentAbstractClass{

    @Override
    public void giveConfirmation(){
        System.err.println("Person to Person Payment Successful");
    }  

    @Override
    public void debitFromSource(){
        System.out.println("Debited from Person");
    }

    @Override
    public void creditToTarget(){
        System.out.println("Credited to Person");
    }
 
}
