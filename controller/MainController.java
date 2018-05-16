package controller;

import model.MainModel;
import view.MainFrame;
import view.MainPanel;

public class MainController {

	public MainController() {
		/* Initialize the model */
		MainModel model = new MainModel();
		/* Initialize the view with a model copy */
		MainPanel panel = new MainPanel(model);
		/* Initialize the controler with a copy of the model */
		MouseController mouseController = new MouseController(model);
		/* add the listeners to the view */
		panel.addMouseListener(mouseController);
		panel.addMouseMotionListener(mouseController);
		/* set the panel to be an observer */
		model.addObserver(panel);
		/* add the panel to the frame and display the application */
		new MainFrame(panel);
	}
}
