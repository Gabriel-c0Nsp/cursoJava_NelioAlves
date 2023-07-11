package entities;

public class Employee {

  public String name;
  public double grossSalary;
  public double tax;

  public double netSalary() {
    double answer = grossSalary - tax;
    return answer;
  }

  public void increaseSalary(double percentage) {
    double answer = (percentage / 100 * grossSalary) + netSalary();
    System.out.println("Updated data: R$" + answer);
  }
}
