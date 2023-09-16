package application;

import java.util.Scanner;

import entities.Rent;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Rent[] vect = new Rent[10];

    System.out.print("How many rooms will be rented? ");
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println();
      System.out.println("Rent #" + i + ":");
      System.out.print("Name: ");
      scanner.nextLine();
      String name = scanner.nextLine();

      System.out.print("Email: ");
      String email = scanner.next();

      System.out.print("Room: ");
      int roomNumber = scanner.nextInt();

      vect[roomNumber] = new Rent(name, email);
    }

    System.out.println();

    System.out.println("Busy rooms:");

    for (int i = 0; i < 10; i++) {
      if (vect[i] != null) {
        System.out.println(i + ": " + vect[i]);
      }
    }


    scanner.close();
    
  }
}
