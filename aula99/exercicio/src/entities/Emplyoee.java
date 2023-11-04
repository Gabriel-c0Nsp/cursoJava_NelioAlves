package entities;

public class Emplyoee {

  private int id;
  private String name;
  private double salary;

  public Emplyoee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void increaseSalary(double percentage) {
    double percentageOfSalary = (percentage/100) * salary;
    double updatedSalary = percentageOfSalary + salary;
    setSalary(updatedSalary); 
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return id + ", " + name + ", " + String.format("%.2f", salary);
  }

}
