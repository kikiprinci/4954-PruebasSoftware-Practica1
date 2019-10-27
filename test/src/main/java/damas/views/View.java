package damas.views;

import damas.controllers.AcceptorController;
import damas.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}

}