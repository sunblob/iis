package factory_builder;

public class Main {

    public static void main(String[] args) {

        Product product = Product.Builder.initBuilder()
                .setName("ipoop2")
                .setDescription("kek")
                .setCategory(new Category("Телефоны", "у телефоны да"))
                .setAmount(10)
                .build();

        product.printInfo();

        Shop shop = Shop.create("My shop");
        shop.printInfo();
        shop.addProduct(product);
        shop.printInfo();
    }
}