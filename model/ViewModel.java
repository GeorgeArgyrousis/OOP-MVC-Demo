package model;

import java.util.ArrayList;

import model.objects.Rectangle;

public class ViewModel extends Model{
	
	public ViewModel(MainModel model){
		super(model);
	}
	
	/* Add a rectangle from the view */
	public void addRectangle(int x, int y, int width, int height) {
		getModel().addRectangle(new Rectangle(x, y, width, height));
	}
	
	/* Get the list of rectangles from the view */
	public ArrayList<Rectangle> getRectangles(){
		return getModel().getRectangles();
	}
}
