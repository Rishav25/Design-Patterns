package Mediator;

import java.util.ArrayList;
import java.util.List;

import Colleague.ColleagueInterface;

public class Auction implements MediatorInterface{
    
    String auctionName;
    int currentBid;
    List<ColleagueInterface> bidderList = new ArrayList<>();

    public Auction(String auctionName, int startBid) {
        this.auctionName = auctionName;
        this.currentBid = startBid;
    }

    @Override
    public void addColleague(ColleagueInterface colleague){
        bidderList.add(colleague);
    }

    @Override
    public int getCurrentBid(){
        return currentBid;
    }
    
    @Override
    public void sendMessage(ColleagueInterface messagerColleague, int bidAmount){
        if(bidAmount < currentBid){
            messagerColleague.receiveRejectedMessage();
            System.out.println("\n");
        }
        else{
            currentBid = bidAmount;
            for(ColleagueInterface Bidder : bidderList){
                if(!messagerColleague.equals(Bidder)){
                    Bidder.receiveMessage();
                }
            }
            System.out.println("\n");
        }
    }

}
