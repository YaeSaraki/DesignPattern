package FactoryMethodPattern;

public class FactoryA implements Factory {
  @Override
  public Product createProduct() { return new ProductA(); }
}
