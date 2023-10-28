package AbstractFactoryPattern;
/**
 * @Program AbstractFactoryPattern 创建型模式
 * @Arthor YaeSaraki
 * @Function {
 *  1. 一个系统要独立于它产品的创建、 *组合* 和表示时
 *  2. 一个系统要由 *多个产品系列* 中的一个来配置时
 *  3. 当要强调一系列相关产品对象的设计以便 *联合使用* 时
 *  4. 当要提供一个产品类库，只想要 *显示他们的接口而不是实现* 时
 * }
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
