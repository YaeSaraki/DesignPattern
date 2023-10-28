package AbstractFactoryPattern;
/**
 * @Program AbstractFactoryPattern 创建型模式
 * @Arthor YaeSaraki
 */
public class AbstractFactory {
  public static void main(String[] args) {
    Factory factory1 = new Factory1();
    ProductA productA1 = factory1.createProductA();
    ProductB productB1 = factory1.createProductB();
    productA1.info();
    productB1.info();

    Factory factory2 = new Factory2();
    ProductA productA2 = factory2.createProductA();
    ProductB productB2 = factory2.createProductB();
    productA2.info();
    productB2.info();

  }
}
