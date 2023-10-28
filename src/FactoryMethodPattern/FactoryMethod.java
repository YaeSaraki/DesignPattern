package FactoryMethodPattern;

/**
 * @Program FactoryMothod() 创建型模式
 * @Arthor YaeSaraki
 * @Function {
 *   1. 当一个类不知道他所必须创建的对象的类的时候
 *   2. 当一个类需要由它的子类来指定它所创建的对象的时候
 *   3. 当类将创建对象的职责委托给多个帮助子类中的某一个，
 *      并且你希望将哪一个帮助子类是代理者这一信息局部化的时候
 * }
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
