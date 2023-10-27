package SimpleFactoryPattern;

public class Factory {
  public static Product createProduct(String type) {
    Product product = null;
    switch (type) {
      case "A":
        product = new ProductA();
        break;
      case "B":
        product = new ProductB();
        break;
      default:
        System.out.println("No" + type);
        break;
    }
    return product;
  }
}
