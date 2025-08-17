package LLD.DesignPatterns.behavioralDP.Mediator;

public interface AuctionMediator {
    public void register(Bidder bidder);
    public void placeBid(Bidder bidder,int amt);
}
