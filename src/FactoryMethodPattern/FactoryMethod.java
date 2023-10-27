package FactoryMethodPattern;

/**
 * @Program FactoryMothod() 创建型模式
 * @Arthor YaeSaraki
 */
public class FactoryMethod {
  public static void main(String[] args) {
    Factory factoryA = new FactoryA();
    Product productA = factoryA.createProduct();
    productA.info();

    Factory factoryB = new FactoryB();
    Product productB = factoryB.createProduct();
    productB.info();
  }
}
