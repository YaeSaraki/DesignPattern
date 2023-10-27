package SimpleFactoryPattern;

/**
 * @Program SimpleFactory(Static Factory Method) 创建型模式
 * @Arthor YaeSaraki
 */
public class SimpleFactory {
  public static void main(String[] args) {
    Product productA = Factory.createProduct("A");
    Product productB = Factory.createProduct("B");
    productA.info();
    productB.info();
  }
}
