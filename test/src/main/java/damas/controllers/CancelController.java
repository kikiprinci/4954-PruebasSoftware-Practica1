package damas.controllers;

import damas.models.Coordinate;
import damas.models.Session;

public class CancelController extends Controller {

    public CancelController(Session session) {
        super(session);
    }

    public boolean isLastMovement(Coordinate origin, Coordinate target) {
        return this.session.isLastMovement(origin, target);
    }
}