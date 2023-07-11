package entities;

public class Product {
  
  public String name;
  public double price;
  public int quantity;

  public double totalValueInStock() {
    double result = price * quantity;
    return result;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    String format = name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock()); 
    return format;
  }
}
