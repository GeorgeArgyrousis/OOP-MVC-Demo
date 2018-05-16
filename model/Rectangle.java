package model;

public class Rectangle {
	
	/* The x coordinate */
	private int x;
	
	/* The y coordinate */
	private int y;
	
	/* The width of the rectangle */
	private int width;
	
	/* The height of the rectangle */
	private int height;
	
	/* Initialize all relevant components */
	public Rectangle(int x, int y, int width, int height) {
		/* TODO : assert values are in between predefined bounds */
		/* TODO : create default values */
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
