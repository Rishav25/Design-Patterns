package Colleague;

import Mediator.MediatorInterface;

public class Bidder implements ColleagueInterface{
    
    String name;
    MediatorInterface auction;
    int currentBid;

    public Bidder(String name, MediatorInterface auction) {
        this.name = name;
        this.auction = auction;
        this.currentBid = auction.getCurrentBid();
        auction.addColleague(this);
    }

    @Override
    public void sendMessage(int bidAmount){
        auction.sendMessage(this, bidAmount);
    }

    @Override
    public void receiveMessage(){
        System.out.println("Bidder : " + name + " received notification that current bid is " + auction.getCurrentBid());
    }
    
    @Override
    public void receiveRejectedMessage(){
        System.out.println("Hey " + name + ", please place a higher bid.");
    }
}
