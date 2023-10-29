package SingletonPattern;
/**
 * @Program SingletonPattern 创建型模式
 * @Arthor YaeSaraki
 */
public class Singleton {
  static Singleton instance = new Singleton();
  private int i = 0;
  private Singleton() {
    ++i;
    System.out.println(i);
  }
  public static Singleton getInstance() { return instance; }
}
