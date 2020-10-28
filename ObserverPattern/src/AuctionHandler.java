import java.util.ArrayList;

public class AuctionHandler implements Subject{
    private ArrayList<Observer> observers;
    private double basePrice;

    public AuctionHandler(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer = " + (observerIndex+1) + " deleted!");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(basePrice);
        }
    }

    public void setBasePrice(double newPrice){
        this.basePrice = newPrice;
        notifyObserver();
    }
}
