package factory_builder;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products;
    private String name;

    private Shop() {}

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                ", name='" + name + '\'' +
                '}';
    }

    public static Shop create(String name) {
        Shop shop = new Shop();
        shop.name = name;
        shop.products = new ArrayList<>();

        return shop;
    }
}
