package CompositePattern;

import java.util.List;

public class File extends AbstractFile {
  public File(String name) { this.name = name; }
  @Override
  public boolean add(AbstractFile abstractFile) {
    return false;
  }
  public boolean delete(AbstractFile abstractFile) { return false; }
  public List<AbstractFile> getChild() { return null; }
}
