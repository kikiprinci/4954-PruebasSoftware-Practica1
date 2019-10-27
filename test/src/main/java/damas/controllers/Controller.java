package damas.controllers;

public abstract class Controller {

    public Controller(Example example) {
        this.example = example;
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
}