package damas.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import damas.models.Session;
import damas.models.StateValue;
import damas.models.Coordinate;
import damas.models.Piece;
import damas.types.Color;

public class StartControllerTest {

    public StartControllerTest() {

    }

    @Test
    public void givenStartControllerWhenBeforeStartNewgameThenNotError(){
        Session session =  new Session();
        StartController startController = new StartController(session);
        assertEquals(session.getValueState(), StateValue.INITIAL);
    }

    @Test
    public void givenStartControllerWhenStartNewgameThenNotError(){
        Session session =  new Session();
        StartController startController = new StartController(session);
        startController.start();
        assertEquals(session.getValueState(), StateValue.IN_GAME);
    }
}