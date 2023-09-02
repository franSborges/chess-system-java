package chess;

public class ChessPosition {

  private char column;
  private int row;

  public ChessPosition() {
    if (column < 'a' || column > 'h' || row < 1 || row > 8) {
      throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.")
    }
    this.column = column;
    this.row = row;
  }

  public char getColumn() {
    return column;
  }

  public int getRow() {
    return row;
  }
  
}
