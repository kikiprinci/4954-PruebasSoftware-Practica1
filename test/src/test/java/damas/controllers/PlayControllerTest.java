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
        Session session = new Session();
        Coordinate originBlack = new Coordinate(2, 1);
        Coordinate targetBlack = new Coordinate(4, 5);
        Coordinate whitePiece = new Coordinate(4, 5);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(originBlack, targetBlack));
        assertNull(session.getPiece(whitePiece));
    }

    public void givenPlayControllerWhenPieceConvertToLadyThenNotError() {
        Session session = new Session();
        Coordinate originBlack = new Coordinate(7, 2);
        Coordinate targetBlack = new Coordinate(8, 3);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(originBlack, targetBlack));
    }


    public void givenPlayControllerWhenLadyToAnyPlaceThenNotError() {
        Session session = new Session();
        Coordinate originBlack = new Coordinate(8, 3);
        Coordinate targetBlack = new Coordinate(4, 7);
        PlayController playController = new PlayController(session);
        assertNull(playController.move(originBlack, targetBlack));
    }


    public void givenPlayControllerWhenColorNotHasMovementsThenNotError() {
        Session session = new Session();
        Coordinate originBlack = new Coordinate(7, 2);
        Coordinate whitePiece = new Coordinate(7, 1);
        PlayController playController = new PlayController(session);
        assertNull(session.getPiece(originBlack));
        assertNull(session.getPiece(whitePiece));
        assertNull(playController.move(originBlack, targetBlack));
    }

}
