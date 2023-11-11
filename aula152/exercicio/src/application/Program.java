package application;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;

import entities.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.Product;
import entities.OrderItem;

public class Program {
  public static void main(String[] args) throws ParseException {
    
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    Date moment = new Date();
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    System.out.println("Enter client data:");

    System.out.print("Name: ");
    String name = scanner.nextLine();
  
    System.out.print("Email: ");
    String email = scanner.next();

    System.out.print("Birth date (DD/MM/YYYY): ");
    String birthDateString = scanner.next();
    Date birthDate = sdf1.parse(birthDateString);

    System.out.println("Enter order data:");

    System.out.print("Status: ");
    scanner.nextLine();
    String status = scanner.nextLine().toUpperCase();

    System.out.print("How many items to this order? ");
    int items = scanner.nextInt();

    Client client = new Client(name, email, birthDate);
    Order order = new Order(moment, OrderStatus.valueOf(status));

    Product[] productArr = new Product[items];

    for (int i = 0; i < items; i++) {
      System.out.println("Enter #" + (i + 1) + " item data:");

      System.out.print("Product name: ");
      scanner.nextLine();
      String productName = scanner.nextLine();

      System.out.print("Product price: ");
      double productPrice = scanner.nextDouble();

      System.out.print("Quantity: ");
      int productQuantity = scanner.nextInt();

      Product product = new Product(productName, productPrice);
      OrderItem item = new OrderItem(productQuantity, productPrice, product);

      order.addItem(item);
    } 

    System.out.println();
    System.out.println("ORDER SUMMARY:");

    System.out.print("Order moment: ");
    String momentFormatted = sdf2.format(moment);
    System.out.println(momentFormatted);

    System.out.print("Order status: ");
    System.out.println(order.getStatus());
    System.out.println(client);

    System.out.println("Order items:");

    order.getItems().forEach(item -> System.out.println(item));

    System.out.println("Total price: $" + String.format("%.2f",order.total()));
  }
}
