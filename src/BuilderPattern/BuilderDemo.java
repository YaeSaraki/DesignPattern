package BuilderPattern;
/**
 * @Program BuilderPattern 创建型模式
 * @Arthor YaeSaraki
 */
public class BuilderDemo {
  public static void main(String[] args) {
    Director director = new Director();
    Builder builder1 = new Builder1();
    Builder builder2 = new Builder2();

    director.construct(builder1);
    Product product1 = builder1.getResult();
    product1.show();

    director.construct(builder2);
    Product product2 = builder2.getResult();
    product2.show();
  }

}
