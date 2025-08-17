package LLD.DesignPatterns.behavioralDP.Mediator;

public class AuctionMediatorDemo {
    public static void main(String[] args) {
        AuctionMediator auctionHouse =new AuctionHouse();
        Bidder bidder1=new Bidder("sandhiya",auctionHouse);
        Bidder bidder2=new Bidder("vignesh",auctionHouse);
        Bidder bidder3=new Bidder("saravana",auctionHouse);

        auctionHouse.register(bidder1);
        auctionHouse.register(bidder2);
        auctionHouse.register(bidder3);

        bidder1.placeBid(500);
        bidder2.placeBid(502);
        bidder3.placeBid(700);
        bidder2.placeBid(702);

        auctionHouse.announceWinner();
    }
}
