package tylerjroach.com.tictactoe;

/**
 * Created by tylerjroach on 4/27/16.
 */
public class Player {
  private String name;
  private String piece;

  public Player(String name, String piece) {
    this.name = name;
    this.piece = piece;
  }

  public String getName() {
    return name;
  }

  public String getPiece() {
    return piece;
  }

}
