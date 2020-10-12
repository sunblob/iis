package observer_iterator;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Observed, Collection {
    String name;
    String address;
    List<Product> products = new ArrayList<>();

    List<Observer> observers = new ArrayList<>();

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void updateShop(String name, String address) {
        this.name = name;
        this.address = address;
        notifyObservers();
    }

    public void addProduct(Product p) {
        products.add(p);
        notifyObservers();
    }

    public void removeProduct(Product p) {
        products.remove(p);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        Buyer buyer = (Buyer) o;
        if (buyer.wantsToBeNotified) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.handleEvent();
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    public class ProductIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < products.size();
        }

        @Override
        public Object next() {
            return products.get(index++);
        }
    }
}
