package BridgePattern;

public class Blue implements Color {
  @Override
  public void operationImpl(String name) {
    System.out.println(name + ": Blue");
  }
}
