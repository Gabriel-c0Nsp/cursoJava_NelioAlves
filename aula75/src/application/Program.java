package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("Price: ");
    double price = scanner.nextDouble();

    System.out.print("Quantity in stock: ");
    int quantity = scanner.nextInt();

    Product product = new Product(name, price, quantity);

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantitiy = scanner.nextInt();
    product.addProducts(quantitiy);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be removed from stock: ");
    quantitiy = scanner.nextInt();
    product.removeProducts(quantitiy);

    System.out.println();
    System.out.println("Updated data: " + product);

    scanner.close();

  }
}
