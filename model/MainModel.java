package model;

import java.util.ArrayList;

import model.objects.Rectangle;

public class MainModel extends Observable{

	/* List of all rectangles */
	private ArrayList<Rectangle> rectangles;
	
	/* Call superconstructor, initalise components */
	public MainModel() {
		super();
		rectangles = new ArrayList<Rectangle>();
	}
	
	/* Add a rectangle to the list and update the observers */
	void addRectangle(Rectangle rect) {
		rectangles.add(rect);
		notifyObservers();
	}
	
	/* Get the position of the rectangle from the list */
	int getRectangleId(Rectangle rect) {
		return rectangles.indexOf(rect);
	}
	
	/* Return a rectangle object based on id*/
	Rectangle getRectangle(int id) {
		if(id < 0 || id > rectangles.size() - 1) {
			/* Rectangle class can have default values */
			return new Rectangle(0, 0, 50, 50);
		}
		return rectangles.get(id);
	}
	
	/* Return the list of rectangles */
	ArrayList<Rectangle> getRectangles(){
		return rectangles;
	}
}
