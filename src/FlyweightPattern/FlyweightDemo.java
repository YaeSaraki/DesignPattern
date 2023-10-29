package FlyweightPattern;

/**
 * @Program FlyweightPattern 结构型模式
 * @Author YaeSaraki
 */

public class FlyweightDemo {
  public static void main(String[] args) {
    PieceFactory factory = new PieceFactory();

    Piece whitePiece1 = factory.getPiece(0);
    System.out.println(whitePiece1);
    whitePiece1.draw(10, 10);

    Piece whitePiece2 = factory.getPiece(0);
    System.out.println(whitePiece2);
    whitePiece2.draw(20, 20);

    Piece blackPiece1 = factory.getPiece(1);
    System.out.println(blackPiece1);

    Piece blackPiece2 = factory.getPiece(1);
    System.out.println(blackPiece1);

    Piece blackPiece3 = factory.getPiece(1);
    System.out.println(blackPiece1);
  }
}
