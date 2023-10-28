package CompositePattern;

import java.util.List;

public abstract class AbstractFile {
  protected String name;
  public void printName() { System.out.println(name); }
  public abstract boolean add(AbstractFile abstractFile);
  public abstract boolean delete(AbstractFile abstractFile);
  public abstract List<AbstractFile> getChild();
}
