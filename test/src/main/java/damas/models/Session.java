package damas.models;

import java.util.List;

public class Session {

    private Game game;

    private State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
    }

    public void resume() {
        this.game =new Game();
        this.state =new State();
    }

    public void next() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public Piece getPiece(Coordinate origin) {
        return game.getPiece(origin);
    }

    public boolean isLastMovement(Coordinate origin, Coordinate target) {
        return false;
    }

    public Turn nextTurn(){
        return null;
    }
}