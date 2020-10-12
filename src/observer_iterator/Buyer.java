package observer_iterator;

public class Buyer implements Observer {

    boolean wantsToBeNotified;

    public Buyer(boolean wantsToBeNotified) {
        this.wantsToBeNotified = wantsToBeNotified;
    }

    @Override
    public void handleEvent() {
        System.out.println("Что-то произошло в мазазине!");
    }
}
