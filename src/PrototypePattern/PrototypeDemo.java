package PrototypePattern;

public class PrototypeDemo {
  public static void main(String[] args) {
    Product product1 = new Product(2023, 10.28);
    System.out.println("Product1: " + product1.getId() + "," + product1.getPrice());
    Product product2 = (Product)product1.clone();
    System.out.println("Product2: " + product2.getId() + "," + product2.getPrice());
  }
}
