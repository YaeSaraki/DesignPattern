package AdapterPattern;
/**
 * @Program AdapterPattern 结构型模式
 * @Arthor YaeSaraki
 */
public class AdapterDemo {
  public static void main(String[] args) {
    Target target = new Adapter();
    target.request();
  }
}
