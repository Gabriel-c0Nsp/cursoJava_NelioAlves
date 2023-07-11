package application;

import java.util.Scanner;

import java.util.Locale;
import entities.Rectangle;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in); 

    Rectangle rectangle = new Rectangle();

    System.out.println("Enter rectangle width and heigth");
    rectangle.width = scanner.nextDouble();
    rectangle.heigth = scanner.nextDouble();

    System.out.printf("AREA = %.2f%n", rectangle.area());
    System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());

    scanner.close();
  }
}
