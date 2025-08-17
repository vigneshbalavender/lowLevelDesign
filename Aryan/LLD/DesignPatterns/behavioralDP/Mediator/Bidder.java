package LLD.DesignPatterns.behavioralDP.Mediator;

public class Bidder {
    private String name;
    private AuctionMediator auctionMediator;
    public Bidder(String name,AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
    }
    public String getName(){
        return name;
    }
    public void placeBid(int amt){
        auctionMediator.placeBid(this,amt);
    }
    public void receiveBid(Bidder bidder,int amt){
        System.out.println(name+" is notified :"+bidder.getName()+" is palced a bid of"+amt);
    }
}
