package FlyweightPattern;

public class WhitePiece extends Piece{
  public WhitePiece() { this.color = "white"; }
  @Override
  public void draw(int x, int y) {
    System.out.println("draw a " + color  + "piece: x = " + x + ", y = " + y);
  }
}
