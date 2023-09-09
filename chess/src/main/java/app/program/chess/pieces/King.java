package app.program.chess.pieces;

import app.program.boardgame.Board;
import app.program.chess.ChessPiece;
import app.program.chess.Color;

public class King extends ChessPiece {
  
  public King(Board board, Color color) {
    super(board, color);
  }

  @Override
  public String toString() {
    return "K";
  }
}
