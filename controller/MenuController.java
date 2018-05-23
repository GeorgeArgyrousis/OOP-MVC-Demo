package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import model.ViewModel;

public class MenuController {
	
	/* The View Model copy */
	private ViewModel model;
	
	/* A list of all the buttons */
	private ArrayList<JButton> buttons;
	
	/* Initiate all relevant components */
	public MenuController(ViewModel model) {
		this.model = model;
		buttons = new ArrayList<JButton>();
		addJButton(new JButton(ButtonType.AddRectangle.getType()));
	}
	
	/* Add a button to the list after calling @method setActions() */
	private void addJButton(JButton button) {
		setActions(button);
		buttons.add(button);
	}
	
	/* TODO :: This functionality should reside in another class,
	 * Maybe an ArrayList of @class ButtonActions... */
	private void setActions(JButton button) {
		if(button.getText().equals(ButtonType.AddRectangle.getType())) {
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					model.addRectangle(10, 10, 160, 90);
				}
			});
		}
	}
	
	/* Return the list of all buttons */
	public ArrayList<JButton> getButtons(){
		return buttons;
	}
}
