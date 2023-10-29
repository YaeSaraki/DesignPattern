package PrototypePattern;
/**
 * @Program PrototypeParrern 创建型模式
 * @Arthor YaeSaraki
 * @Function {
 *   1. 当一个系统应该独立于它的产品创建、 *构成* 和表示的时候
 *   2. 当要实例化的类是在运行时刻指定时，例如通过动态装载
 *   3. 当一个类的实例只能由几种不同状态组合中的一种时，建立原型模型进行克隆更方便快捷
 * }
 */
public class PrototypeDemo {
  public static void main(String[] args) {
    Product product1 = new Product(2023, 10.28);
    System.out.println("Product1: " + product1.getId() + "," + product1.getPrice());
    Product product2 = (Product)product1.clone();
    System.out.println("Product2: " + product2.getId() + "," + product2.getPrice());
  }
}
