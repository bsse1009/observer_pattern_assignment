public class BidderObserver implements Observer {
    private double basePrice;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public BidderObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        //System.out.println("New observer " + this.observerID);
        stockGrabber.register(this);
    }
    @Override
    public void update(double basePrice) {
        if(this.basePrice < basePrice){
            this.basePrice = basePrice;
            printPrices();
        }
    }

    public void printPrices()
    {
        System.out.println("observer ID: "+ observerID+"\ncurrent price: "+basePrice);
    }
}
