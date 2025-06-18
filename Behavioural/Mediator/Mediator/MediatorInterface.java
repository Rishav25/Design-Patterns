package Mediator;

import Colleague.ColleagueInterface;

public interface MediatorInterface {
    public void addColleague(ColleagueInterface colleague);
    public void sendMessage(ColleagueInterface messagerColleague, int bidAmount);
    public int getCurrentBid();
}
