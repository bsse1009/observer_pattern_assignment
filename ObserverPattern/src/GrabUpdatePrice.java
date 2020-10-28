public class GrabUpdatePrice {
    public static void main(String[] args) {
        AuctionHandler auctionHandler = new AuctionHandler();
        BidderObserver observer1 = new BidderObserver(auctionHandler);
        BidderObserver observer2 = new BidderObserver(auctionHandler);
        BidderObserver observer3 = new BidderObserver(auctionHandler);
        auctionHandler.setBasePrice(1111.111);
        auctionHandler.setBasePrice(11122);
        auctionHandler.setBasePrice(111.00);
        auctionHandler.unRegister(observer2);
        auctionHandler.setBasePrice(1112222.22);

    }
}
