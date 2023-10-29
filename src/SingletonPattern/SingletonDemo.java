package SingletonPattern;
/**
 * @Program SingletonPattern 创建型模式
 * @Arthor YaeSaraki
 * @Function {
 *   1. 当类只有一个实例而客户可以从一个总所周知的访问点访问时
 *   2. 当这个唯一的类时可以通过自子类化扩展的，并且客户端无需更改代码就能使用一个扩展的实例时
 * }
 */
public class SingletonDemo {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    Singleton instance3 = Singleton.getInstance();
    Singleton instance4 = Singleton.getInstance();

  }
}
