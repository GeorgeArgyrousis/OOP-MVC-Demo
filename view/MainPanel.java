package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;

import model.ViewModel;
import model.objects.Rectangle;

public class MainPanel extends Observer{

	/* serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* A Viewer model copy to render */
	private ViewModel model;
	
	/* Initialize the relevant component */
	public MainPanel(ViewModel model) {
		super();
		this.model = model;
	}
	
	/* Deafault method called by the JPanel object to draw */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawRectangles(g);
	}
	
	/* Draw all the rectangles from the model */
	private void drawRectangles(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		for(Rectangle rectangle : model.getRectangles()) {
			int x = rectangle.getX(), y = rectangle.getY();
			int width = rectangle.getWidth(), height = rectangle.getHeight();
			g.fillRect(x, y, width, height);
		}
	}
	
	/* Add the relevant button on the master panel */
	public void addButtons(ArrayList<JButton> buttons) {
		for(JButton button : buttons) {
			button.setBounds(0, 205, 150, 50);
			button.setForeground(Color.WHITE);
			button.setBackground(Color.GRAY);
			button.setContentAreaFilled(true);
			button.setBorderPainted(false);
			button.setOpaque(true);
			this.add(button);
		}
	}
}
