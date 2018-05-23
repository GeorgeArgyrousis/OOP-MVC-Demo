package model;

public abstract class Model {
	
	/* The main model containing low level access */
	private MainModel model;
	
	/* Initiate the relevant components (injection) */
	public Model(MainModel model) {
		this.model = model;
	}
	
	/* Retrieve the model */
	public MainModel getModel() {
		return this.model;
	}
}
