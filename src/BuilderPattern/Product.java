package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
  private final List<String> parts = new ArrayList<>();
  public void add(String part) { parts.add(part); }
  public void show() {
    System.out.println("Product: ");
    for (String part : parts) { System.out.print(part + " "); }
    System.out.println();
  }
}
