package Encapsulation;

public class ProductInfo {
    public void showProductInfo(Product product) {
        System.out.println("");
        System.out.println("Below are product details...");
        System.out.println("Encapsulation.Product name: "+product.getName());
        System.out.println("Encapsulation.Product genre: "+product.getGenre());
        System.out.println("Encapsulation.Product id: "+product.getId());
        System.out.println("Encapsulation.Product price: "+product.getPrice());
    }
}
