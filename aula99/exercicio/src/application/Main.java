package aplication;

import entities.Emplyoee;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Emplyoee> employees = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int numberEmployees = scanner.nextInt();

    for (int i = 0; i < numberEmployees; i++) {
      System.out.println("Emplyoee #" + (i + 1) + ":");
      System.out.print("Id: ");
      int id = scanner.nextInt();

      for (int j = 0; j < employees.size(); j++) {
        Emplyoee compareEmplyoee = employees.get(j);
        if (id == compareEmplyoee.getId()) {
          System.out.println("You must insert a unique id");
          return; // ends program if this id has already been used
        }
      }

      System.out.print("Name: ");
      scanner.nextLine();
      String name = scanner.nextLine();

      System.out.print("Salary: ");
      double salary = scanner.nextDouble();

      Emplyoee employee = new Emplyoee(id, name, salary);

      employees.add(employee);
    }

    boolean idFound = false;

    System.out.print("Enter the employee id that will have salary increase: ");
    double employeeId = scanner.nextDouble();

    for (int i = 0; i < employees.size(); i++) {
      Emplyoee compareEmplyoee = employees.get(i);
      if (employeeId == compareEmplyoee.getId()) {
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        compareEmplyoee.increaseSalary(percentage);

        idFound = true;
        break;
      }

    }

    if (!idFound) {
      System.out.println("This id does not exist!");
      return;
    }

    System.out.println();

    System.out.println("List of employees:");

    for (Emplyoee emplyoee : employees) {
      System.out.println(emplyoee);
    }

    scanner.close();

  }
}
