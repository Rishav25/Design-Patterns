import Colleague.Bidder;
import Colleague.ColleagueInterface;
import Mediator.Auction;
import Mediator.MediatorInterface;

public class Main {
    public static void main(String[] args) {
        MediatorInterface auction = new Auction("Mona Lisa", 100000);
        ColleagueInterface bidder1 = new Bidder("Bidder1" , auction);
        ColleagueInterface bidder2 = new Bidder("Bidder2" , auction);
        ColleagueInterface bidder3 = new Bidder("Bidder3" , auction);

        bidder1.sendMessage(1000);
        bidder2.sendMessage(20000000);
        bidder1.sendMessage(200);
        bidder3.sendMessage(30000000);
        bidder1.sendMessage(45000000);
        bidder2.sendMessage(50000000);
        bidder1.sendMessage(60000000);
    }
}
