package CompositePattern;

import java.util.List;
import java.util.ArrayList;

public class Folder extends AbstractFile {
  private final List<AbstractFile> fileList = new ArrayList<>();
  public Folder(String name) { this.name = name; }
  @Override
  public boolean add(AbstractFile abstractFile) { return fileList.add(abstractFile); }
  @Override
  public boolean delete(AbstractFile abstractFile) { return fileList.remove(abstractFile); }
  @Override
  public List<AbstractFile> getChild() { return fileList; }
}
