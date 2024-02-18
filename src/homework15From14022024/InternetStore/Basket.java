package homework15From14022024.InternetStore;
import java.util.ArrayList;
 class Basket {
    ArrayList<Product> purchasedProducts;

    public Basket() {
        purchasedProducts = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        purchasedProducts.add(product);
    }
}
