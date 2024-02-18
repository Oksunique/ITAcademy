package homework15From14022024.InternetStore;
import java.util.ArrayList;
 class Category {
    String name;
    ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
