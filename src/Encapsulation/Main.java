package Encapsulation;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        1. Basic program to demonstrate encapsulation.

        2. Encapsulation is a process of binding data and method together in
        a single unit and providing security by restricting direct access to
        some components.

        3. Getting product details through console and setting it using
        setter methods.

        4. Direct access to product class fields or instance variables is
        restricted and indirect access is provided through getters.
        */

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        ProductInfo prodInfo = new ProductInfo();
        System.out.println("Enter product details below...");
        System.out.println("Enter product name");
        String name = sc.nextLine();
        product.setName(name);
        System.out.println("Enter product genre");
        String genre = sc.nextLine();
        product.setGenre(genre);
        System.out.println("Enter product price");
        int price = sc.nextInt();
        product.setPrice(price);
        System.out.println("Enter product id");
        int id = sc.nextInt();
        product.setId(id);

        prodInfo.showProductInfo(product);

    }
}
