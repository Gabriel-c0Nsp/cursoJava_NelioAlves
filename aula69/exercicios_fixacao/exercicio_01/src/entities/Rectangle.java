package entities;

public class Rectangle {

  public double width;
  public double heigth;

  public double area() {
    return width * heigth;
  }

  public double perimeter() {
    return (width * 2) + (heigth * 2);
  }

  public double diagonal() {
    double sum = Math.pow(width, 2) + Math.pow(heigth, 2);
    return Math.sqrt(sum);
  }
}
