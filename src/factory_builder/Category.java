package factory_builder;

public class Category {

    private String name;
    private String description;

    public Category(String name, String description) {
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
