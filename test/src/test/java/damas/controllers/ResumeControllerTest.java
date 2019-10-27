package damas.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import damas.models.Session;
import damas.models.StateValue;

public class ResumeControllerTest {

    public ResumeControllerTest() {

    }

    @Test
    public void givenResumeControllerWhenNewtGameRequireNotError() {
        Session session = new Session();
        ResumeController resumeController = new ResumeController(session);
        resumeController.resume(true);
        assertEquals(session.getValueState(), StateValue.INITIAL);
    }

    @Test
    public void givenResumeControllerWhenNextTurnRequireNotError() {
        Session session = new Session();
        ResumeController resumeController = new ResumeController(session);
        resumeController.resume(false);
        assertEquals(session.getValueState(), StateValue.IN_GAME);
    }
}