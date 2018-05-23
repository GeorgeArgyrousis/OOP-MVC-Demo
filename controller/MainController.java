package controller;

import model.MainModel;
import model.MouseModel;
import model.ViewModel;
import view.MainFrame;
import view.MainPanel;

public class MainController {

	public MainController() {
		/* Initialize the model */
		MainModel model = new MainModel();
		/* Differentiate the model for different controllers */
		
		/* Model view for the mouse controller */
		MouseModel mouseModel = new MouseModel(model);
		/* Model access for the view */
		ViewModel viewModel = new ViewModel(model);
		/* Initialize the view with a model copy */
		MainPanel panel = new MainPanel(viewModel);
		/* Initialize the Menu Controller with the viewModel */
		MenuController menuController = new MenuController(viewModel);
		/* Initialize the controler with a copy of the Mouse Model */
		MouseController mouseController = new MouseController(mouseModel);
		/* add the listeners to the view */
		panel.addMouseListener(mouseController);
		panel.addMouseMotionListener(mouseController);
		panel.addButtons(menuController.getButtons());
		/* set the panel to be an observer */
		model.addObserver(panel);
		/* add the panel to the frame and display the application */
		new MainFrame(panel);
	}
}
