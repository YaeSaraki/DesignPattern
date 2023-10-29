package BuilderPattern;

public class Builder2 extends Builder {
  Product product = new Product();
  @Override
  public void builderPart() {
    product.add("2");
    product.add("A");
    product.add("B");
    product.add("C");
    product.add("D");
  }
  @Override
  public Product getResult() { return product; }
}
