package observer_iterator;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("Магазин 24/7", "г. Москва");
        shop.addObserver(new Buyer(true));

        shop.addProduct(new Product("Мороженое", 20));
        shop.addProduct(new Product("Пирожки с картошкой", 10));

        Iterator iterator = shop.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
