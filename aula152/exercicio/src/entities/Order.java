package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;
import entities.OrderItem;

public class Order {

  private Date moment;
  private OrderStatus status;

  private List<OrderItem> items = new ArrayList<>();

  public Order() {
  }

  public Order(Date moment, OrderStatus status) {
    this.moment = moment;
    this.status = status;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void removeItem(OrderItem item) {
    items.remove(item);
  }

  public double total() {
    double totalSum = 0;
    double sum = 0;
    for (OrderItem item : items) {
      sum = item.subTotal();
      totalSum += sum;
    }
    return totalSum;
  }

}
