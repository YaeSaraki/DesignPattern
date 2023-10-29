package FacadePattern;

/**
 * @Program FacadePattern 结构型模式
 * @Author YaeSaraki
 */
public class FacadeDemo {
  public static void main(String[] args) {
    Facade facade = new Facade();
    facade.methodA();
    facade.methodB();
    facade.methodC();
  }
}
