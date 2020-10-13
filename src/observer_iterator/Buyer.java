package observer_iterator;

public class Buyer implements Observer {

    @Override
    public void handleEvent() {
        System.out.println("Что-то произошло в мазазине!");
    }
}
