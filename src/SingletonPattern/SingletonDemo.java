package SingletonPattern;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    Singleton instance3 = Singleton.getInstance();
    Singleton instance4 = Singleton.getInstance();

  }
}
