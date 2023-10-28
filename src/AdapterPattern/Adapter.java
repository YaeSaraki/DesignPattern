package AdapterPattern;

public class Adapter extends Target {
  Adaptee adaptee = new Adaptee();
  @Override
  public void request() {
    adaptee.specificRequest();
  }
}
