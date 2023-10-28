package PrototypePattern;

public class Product implements Prototype {
  private int id;
  private double price;
  public Product() {};
  public Product(int id, double price) {
    this.id = id;
    this.price = price;
  }
  public int getId() { return this.id; }
  public double getPrice() { return this.price; }
  @Override
  public Object clone() {
    Product object = new Product();
    object.id = this.id;
    object.price = this.price;
    return object;
  }

}
