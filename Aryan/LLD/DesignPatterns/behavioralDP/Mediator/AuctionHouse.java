package LLD.DesignPatterns.behavioralDP.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator{
    List<Bidder> bidderList ;
    Bidder topBidder;
    int topAmount;
    public AuctionHouse(){
        bidderList = new ArrayList<>();
    }
    @Override
    public void register(Bidder bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amt) {
        System.out.println(bidder.getName()+" placed a bid of "+amt);
        topBidder=bidder;topAmount=amt;
        for(Bidder other:bidderList){
            if(other!=bidder){
                other.receiveBid(bidder,amt);
            }
        }
    }
    public void announceWinner(){
        System.out.println(topBidder.getName()+" won the Auction with a bid of $"+topAmount);
    }
}
