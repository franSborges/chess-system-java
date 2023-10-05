package app.program.chess.pieces;

import app.program.boardgame.Board;
import app.program.boardgame.Position;
import app.program.chess.ChessPiece;
import app.program.chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // Above
        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Below
        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Left
        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Right
        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Northwest
        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Northeast
        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Southwest
        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Southeast
        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}