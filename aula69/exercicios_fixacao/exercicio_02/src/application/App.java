package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class App {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.print("Name: ");
    employee.name = scanner.nextLine();

    System.out.print("Gross salary: ");
    employee.grossSalary = scanner.nextDouble();

    System.out.print("Tax: ");
    employee.tax = scanner.nextDouble();

    System.out.println(employee.name + ", R$" + employee.netSalary());

    System.out.print("Witch percentage to increase salary?: ");
    double percentage = scanner.nextDouble();

    employee.increaseSalary(percentage);
    
    scanner.close();

  }
}
