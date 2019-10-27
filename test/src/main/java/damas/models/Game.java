package damas.models;

public class Game {

    protected Board board;
    protected Turn turn;

    public Game() {
        this.clear();
    }

    public void clear() {
        
    }

    public boolean isLooser() {
        return false;
    }

    public boolean isWinner() {
        return true;
    }

    public Piece getPiece(Coordinate origin) {
        return null;
    }
}