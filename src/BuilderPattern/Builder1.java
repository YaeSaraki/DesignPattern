package BuilderPattern;

public class Builder1 extends Builder {
  Product product = new Product();
  @Override
  public void builderPart() {
    product.add("1");
    product.add("A");
    product.add("B");
    product.add("C");
    product.add("D");
    product.add("E");
    product.add("F");
    product.add("G");
  }
  @Override
  public Product getResult() { return product; }

}
