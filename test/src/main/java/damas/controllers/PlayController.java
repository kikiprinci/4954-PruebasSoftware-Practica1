package damas.controllers;

import java.util.List;

import damas.models.Coordinate;
import damas.models.Piece;
import damas.models.Session;
import damas.models.Turn;
import damas.types.Color;
import damas.types.Error;

public class PlayController extends AcceptorController {

    private CancelController cancelController;
    private MoveController moveController;

    public PlayController(Session session) {
        super(session);
        this.cancelController = new CancelController(session);
        this.moveController = new MoveController(session);
    }

    
	public Error move(Coordinate origin, Coordinate target){
        return null;
    }

    public Turn nextTurn(){
        return this.session.nextTurn();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}