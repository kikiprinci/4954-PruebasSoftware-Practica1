package damas.views.console;

import damas.controllers.Controller;
import damas.utils.WithConsoleView;

public class PieceView extends WithConsoleView {
	
	
	private Controller controller;
	
	public PieceView(Controller controller) {
		super();
		this.controller = controller;
	}

}