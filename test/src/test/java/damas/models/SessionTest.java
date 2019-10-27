package damas.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SessionTest {

    public SessionTest() {
    }

    @Test
    public void givenSessionWhenGetValueStateThenNotError() {
        Session session = new Session();
        assertNull(session.getValueState());
    }

    @Test
    public void givenSessionWhenIsLooserThenNotError() {
        Session session = new Session();
        assertFalse(session.isLooser());
    }

    @Test
    public void givenSessionWhenIsWinnerThenNotError() {
        Session session = new Session();
        assertTrue(session.isWinner());
    }

}