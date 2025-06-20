import Payment.*;

public class Main {
    public static void main(String[] args) {
        PaymentAbstractClass personToPersonPayment = new PersonToPersonPayment();
        PaymentAbstractClass personToOrgPayment = new PersonToOrgPayment();

        personToPersonPayment.sendMoney();
        System.out.println();
        personToOrgPayment.sendMoney();
    }
}
