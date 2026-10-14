public class ProductInfo {
    public void showProductInfo(Product product) {
        System.out.println("");
        System.out.println("Below are product details...");
        System.out.println("Product name: "+product.getName());
        System.out.println("Product genre: "+product.getGenre());
        System.out.println("Product id: "+product.getId());
        System.out.println("Product price: "+product.getPrice());
    }
}
