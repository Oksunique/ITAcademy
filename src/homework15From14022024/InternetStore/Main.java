package homework15From14022024.InternetStore;

public class Main {
    public static void main(String[] args) {
        Category clothingCategory = new Category("Clothing");
        Product tShirt = new Product("T-Shirt", 100.0, 5);
        clothingCategory.addProduct(tShirt);

        Category electronicsCategory = new Category("Footwear ");
        Product sneakers = new Product("Sneakers", 500.0, 3);
        electronicsCategory.addProduct(sneakers);

        Basket basket = new Basket();
        basket.addToBasket(tShirt);
        basket.addToBasket(sneakers);

        System.out.println("Products in the basket:");
        for (Product product : basket.purchasedProducts) {
            System.out.println("Name: " + product.name + ", Price: $" + product.price + ", Rating: " + product.rating);
        }
    }
}
