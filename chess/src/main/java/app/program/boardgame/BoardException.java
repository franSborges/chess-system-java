package app.program.boardgame;

public class BoardException extends RuntimeException{
  
  private static final long serialVersionUID = 1L;

  public BoardException(String msg) {
    super("Board Exception: " +msg);
  }

}
