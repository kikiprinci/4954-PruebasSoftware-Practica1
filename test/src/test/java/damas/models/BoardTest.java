package damas.models;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BoardTest {
    public BoardTest() {
    }

    @Test
    public void givenBoardTestWhenPieceWhitePositionsNotError() {
        // First Position
        Coordinate coordinateFirstPosition = new Coordinate(8, 1);
        Session session = new Session();
        Piece pieceFirstPosition = session.getPiece(coordinateFirstPosition);
        assertNotNull(pieceFirstPosition);
        // Last position
        Coordinate coordinateWhitePosition = new Coordinate(8, 8);
        Piece pieceeLastPosition = session.getPiece(coordinateWhitePosition);
        assertNull(pieceeLastPosition);
    }

    @Test
    public void givenBoardTestWhenPieceBlackPositionsNotError() {
        // First Position
        Coordinate coordinateFirstPosition = new Coordinate(1, 2);
        Session session = new Session();
        Piece pieceFirstPosition = session.getPiece(coordinateFirstPosition);
        assertNotNull(pieceFirstPosition);
        // Last position
        Coordinate coordinateWhitePosition = new Coordinate(1, 1);
        Piece pieceeLastPosition = session.getPiece(coordinateWhitePosition);
        assertNull(pieceeLastPosition);

    }
}