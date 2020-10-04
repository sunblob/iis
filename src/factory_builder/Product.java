package factory_builder;

public class Product {

    private String name;
    private String description;
    private int amount;
    private Category category;

    private Product() {}

    public static Builder create() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", category=" + category +
                '}';
    }

    public static class Builder {

        private String name;
        private String description;
        private int amount;
        private Category category;

        private Builder() {}

        public static Builder initBuilder() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.name = this.name;
            product.description = this.description;
            product.amount = this.amount;
            product.category = this.category;

            return product;
        }
    }
}
