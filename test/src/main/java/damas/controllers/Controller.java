package damas.controllers;

import damas.models.Session;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;
    }
}