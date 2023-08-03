package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    Product[] vect = new Product[n];

    for (int i = 0; i < n; i++) {
      scanner.nextLine();
      String name = scanner.nextLine();
      double price = scanner.nextDouble();
      vect[i] = new Product(name, price);
    }

    double sum = 0;

    for (int i = 0; i < n; i++) {
      sum += vect[i].getPrice();
    }
    double avg = sum / n;

    System.out.printf("AVERAGE PRICE = %.2f%n", avg);

    scanner.close();

  }
}
