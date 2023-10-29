package FlyweightPattern;

public class BlackPiece extends Piece {
  public BlackPiece() { this.color = "black"; }
  @Override
  public void draw(int x, int y) {
    System.out.println("draw a " + color  + "piece: x = " + x + ", y = " + y);
  }
}
