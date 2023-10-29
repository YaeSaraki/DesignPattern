package BridgePattern;

public class Red implements Color{
  @Override
  public void operationImpl(String name) {
    System.out.println(name + ": Red");
  }
}
