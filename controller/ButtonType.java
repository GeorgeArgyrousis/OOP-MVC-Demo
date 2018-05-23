package controller;

public enum ButtonType {

	/* Add multiple other Button Types with 
	 * specific functionality */
	AddRectangle("Add Rectangle");
	
	/* The string desctiption of a button */
	private String type;
	
	/* Initiate the type */
	ButtonType(String type) {
		this.type = type;
	}
	
	/* Get the type */
	public String getType() {
		return this.type;
	}
}
