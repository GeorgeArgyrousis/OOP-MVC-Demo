package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import model.MouseModel;

public class MouseController implements MouseListener, MouseMotionListener{
	
	/* Copy of the model */
	private MouseModel model;
	
	/* integer to hold the selected id of the rectangle object */
	private int selection;
	
	public MouseController(MouseModel model) {
		this.model = model;
		this.selection = -1;
	}

	@Override
	/* Update the rectangle based on the position 
	 * of the mouse */
	public void mouseDragged(MouseEvent e) {
		if(selection > -1) {
			int x = e.getX(), y = e.getY();
			model.updateRectangle(selection, x, y);
		}
	}

	@Override
	/* Create a rectangle (didn't want to make a button)
	 * and check if the mouse is inside the bounds of a
	 * rectangle */
	public void mousePressed(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		selection = model.selectedRectangle(x, y);
	}

	@Override
	/* Reset the selection object */
	public void mouseReleased(MouseEvent e) {
		selection = -1;
	}
	
	/* Unused block of code. */
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
