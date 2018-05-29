package model;

import model.objects.Rectangle;

public class MouseModel extends AbstractModel{
	
	/* Init the Model superclass */
	public MouseModel(MainModel model) {
		super(model);
	}
	
	/* Add a rectangle from the view */
	public void addRectangle(int x, int y, int width, int height) {
		getModel().addRectangle(new Rectangle(x, y, width, height));
	}
	
	/* Get the id of the selected rectangle based on 
	 * the coordinates of a click, -1 if we are out of bounds. */
	public int selectedRectangle(int x, int y) {
		for(Rectangle rectangle : getModel().getRectangles()) {
			if(y > rectangle.getY() && x > rectangle.getX()
			&& y < rectangle.getHeight() + rectangle.getY() && x < rectangle.getWidth() + rectangle.getX()) {
				return getModel().getRectangleId(rectangle);
			}
		}
		return -1;
	}
	
	/* Update the position of a rectangle from the view */
	public void updateRectangle(int id, int x, int y) {
		Rectangle rectangle = getModel().getRectangle(id);
		rectangle.setX(x - (rectangle.getWidth() / 2));
		rectangle.setY(y - (rectangle.getHeight() / 2));
		getModel().notifyObservers();
		rectangle = null;
	}
}
