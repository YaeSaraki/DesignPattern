package BridgePattern;
/**
 * @Program BridgePattern 结构型模式
 * @Author YaeSaraki
 */
public class BridgeDemo {
  public static void main(String[] args) {
    Product productA = new ProductA();
    Color red = new Red();
    Color blue = new Blue();
    productA.setName("ProductA");
    productA.setColor(red);
    productA.operation();
  }
}
