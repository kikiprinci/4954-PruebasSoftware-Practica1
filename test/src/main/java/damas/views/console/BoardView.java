package damas.views.console;

import damas.controllers.Controller;
import damas.utils.WithConsoleView;

public class BoardView extends WithConsoleView {
	
	
	private Controller controller;
	
	public BoardView(Controller controller) {
		super();
		this.controller = controller;
	}

}