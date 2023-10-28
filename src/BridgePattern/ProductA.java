package BridgePattern;

public class ProductA extends Product {
  @Override
  public void operation() {
    color.operationImpl(this.getName());
  }
}
