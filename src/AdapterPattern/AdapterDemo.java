package AdapterPattern;

public class AdapterDemo {
  public static void main(String[] args) {
    Target target = new Adapter();
    target.request();
  }
}
