package view;

import java.awt.Color;
import java.awt.Graphics;

import model.MainModel;
import model.Rectangle;

public class MainPanel extends Observer{

	/* serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* A model copy to render */
	private MainModel model;
	
	/* Initialize the relevant component */
	public MainPanel(MainModel model) {
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
		g.setColor(Color.darkGray);
		for(Rectangle rectangle : model.getRectangles()) {
			int x = rectangle.getX(), y = rectangle.getY();
			int width = rectangle.getWidth(), height = rectangle.getHeight();
			g.fillRect(x, y, width, height);
		}
	}
}
