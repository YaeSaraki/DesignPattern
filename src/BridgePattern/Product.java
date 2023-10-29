package BridgePattern;

public abstract class Product {
  private String name;
  protected Color color;
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public Color getColor() { return color; }
  public void setColor(Color color) { this.color = color; }
  public abstract void operation();
}
