package damas;

import damas.controllers.AcceptorController;
import damas.controllers.Logic;
import damas.views.View;
import damas.views.console.ConsoleView;

public class Damas {

	private Logic logic;

	private View view;

	protected Damas() {
		this.logic = new Logic();
		this.view = new ConsoleView();
	}

	public static void main(String[] args) {
		new Damas().play();
	}

	protected void play() {
		AcceptorController acceptorController;
		do {
			acceptorController = this.logic.getController();
			if (acceptorController != null) {
				this.view.interact(acceptorController);
			}
		} while (acceptorController != null);
	}

}
