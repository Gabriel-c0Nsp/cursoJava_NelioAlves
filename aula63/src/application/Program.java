package application;

import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    Triangle x = new Triangle();
    Triangle y = new Triangle();

    System.out.println("Enter the measures of the triangle X");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();

    System.out.println("Enter the measures of the triangle Y");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double areaX = x.area;
    double areaY = x.area;
   
    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Larger area: X");
    }
    else {
      System.out.println("Larger area: Y");
    }

    scanner.close();

  }
}
