package CompositePattern;
/**
 * @Program CompositePattern 构造型
 * @Author YaeSaraki
 */
import java.util.List;

public class CompositeDemo {
  public static void main(String[] args) {
    AbstractFile root = new Folder("root");
    AbstractFile folderA = new Folder("folderA");
    AbstractFile fileA = new File("fileA");
    AbstractFile fileB = new File("FileB");
    AbstractFile fileC = new File("FileC");
    AbstractFile fileD = new File("FileD");
    AbstractFile fileE = new File("FileE");

    root.add(folderA);
    root.add(fileB);
    root.add(fileC);
    folderA.add(fileD);
    folderA.add(fileE);

    print(root, 0);
  }

  public static void print(AbstractFile file, int level) {
    for (int i = 0; i < level * 3; ++i) System.out.print("-");
    file.printName();

    List<AbstractFile> childList = file.getChild();
    if (childList == null) return;
    for (AbstractFile child : childList) {
      print(child, level + 1);
    }

  }
}
