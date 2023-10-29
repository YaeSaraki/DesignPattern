package FlyweightPattern;

public class PieceFactory {
  private final Piece[] pieces = { new WhitePiece(), new BlackPiece() };
  public Piece getPiece(int key) {
    return pieces[key];
  }
}
