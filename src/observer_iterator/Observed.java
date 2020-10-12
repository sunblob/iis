package observer_iterator;

public interface Observed {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
