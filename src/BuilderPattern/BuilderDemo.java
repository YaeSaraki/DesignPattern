package BuilderPattern;
/**
 * @Program BuilderPattern 创建型模式
 * @Arthor YaeSaraki
 * @Function {
 *   1. 当创建复杂对象的 *算法应该独立* 于该对象的组成部分以及他们的装配时
 *   2. 当构造过程必须允许被构造的对象 *有不同的表示* 时
 * }
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
