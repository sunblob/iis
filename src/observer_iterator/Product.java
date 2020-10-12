package observer_iterator;

public class Product {
    String name;
    int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
