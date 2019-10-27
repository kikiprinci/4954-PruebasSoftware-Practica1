package damas.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import damas.models.Session;
import damas.models.Coordinate;
import damas.models.Piece;
import damas.types.Color;

public class PlayControllerTest {

    public PlayControllerTest() {

    }

    @Test
    public void givenPlayControllerWhenMovementRequiereCorrectThenNotError() {
        Session session = new Session();
        Coordinate origin = new Coordinate(2, 1);
        Coordinate target = new Coordinate(3, 2);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(origin, target));
        assertNull(session.getPiece(origin));
        Piece pieceTarget = session.getPiece(target);
        assertNull(pieceTarget);
        assertEquals(pieceTarget.getColor(), Color.WHITE);
    }

    @Test
    public void givenPlayControllerWhenMovementHorizonatlThenError() {
        Session session = new Session();
        Coordinate origin = new Coordinate(2, 1);
        Coordinate target = new Coordinate(2, 2);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(origin, target));
    }

    @Test
    public void givenPlayControllerWhenMovementVerticalThenError() {
        Session session = new Session();
        Coordinate origin = new Coordinate(2, 1);
        Coordinate target = new Coordinate(3, 1);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(origin, target));
    }

    public void givenPlayControllerWhenMovementToRandomCoordinateThenError() {
        Session session = new Session();
        Coordinate origin = new Coordinate(2, 1);
        Coordinate target = new Coordinate(5, 2);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(origin, target));
    }


    public void givenPlayControllerWhenPieceEatAnotherThenNotError() {

    }

    public void givenPlayControllerWhenPieceConvertToLadyThenNotError() {

    }

    public void givenPlayControllerWhenColorNotHasMovementsThenNotError() {

    }

}