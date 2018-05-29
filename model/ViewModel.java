package model;

import java.util.ArrayList;

import model.objects.Rectangle;

public class ViewModel extends AbstractModel{
	
	public ViewModel(MainModel model){
		super(model);
	}
	
	/* Get the list of rectangles from the view */
	public ArrayList<Rectangle> getRectangles(){
		return getModel().getRectangles();
	}
}
