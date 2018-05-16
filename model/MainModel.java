package model;

import java.util.ArrayList;

public class MainModel extends Observable{

	/* List of all rectangles */
	private ArrayList<Rectangle> rectangles;
	
	/* Call superconstructor, initalise components */
	public MainModel() {
		super();
		rectangles = new ArrayList<Rectangle>();
	}
	
	/* Add a rectangle from the view */
	public void addRectangle(int x, int y, int width, int height) {
		this.addRectangle(new Rectangle(x, y, width, height));
	}
	
	/* Add a rectangle to the list and update the observers */
	private void addRectangle(Rectangle rect) {
		rectangles.add(rect);
		notifyObservers();
	}
	
	/* Get the id of the selected rectangle based on 
	 * the coordinates of a click, -1 if we are out of bounds. */
	public int selectedRectangle(int x, int y) {
		for(Rectangle rectangle : rectangles) {
			if(y > rectangle.getY() && x > rectangle.getX()
			&& y < rectangle.getHeight() + rectangle.getY() && x < rectangle.getWidth() + rectangle.getX()) {
				return getRectangleId(rectangle);
			}
		}
		return -1;
	}
	
	/* Get the position of the rectangle from the list */
	private int getRectangleId(Rectangle rect) {
		return rectangles.indexOf(rect);
	}
	
	/* Update the position of a rectangle from the view */
	public void updateRectangle(int id, int x, int y) {
		Rectangle rectangle = getRectangle(id);
		rectangle.setX(x - (rectangle.getWidth() / 2));
		rectangle.setY(y - (rectangle.getHeight() / 2));
		notifyObservers();
		rectangle = null;
	}
	
	/* Return a rectangle object based on id*/
	private Rectangle getRectangle(int id) {
		if(id < 0 || id > rectangles.size() - 1) {
			/* Rectangle class can have default values */
			return new Rectangle(0, 0, 50, 50);
		}
		return rectangles.get(id);
	}
	
	/* Return the list of rectangles */
	public ArrayList<Rectangle> getRectangles(){
		return rectangles;
	}
}
