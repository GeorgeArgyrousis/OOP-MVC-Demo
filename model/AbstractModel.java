package model;

public abstract class AbstractModel {
	
	/* The main model containing low level access */
	private MainModel model;
	
	/* Initiate the relevant components (injection) */
	public AbstractModel(MainModel model) {
		this.model = model;
	}
	
	/* Retrieve the model */
	public MainModel getModel() {
		return this.model;
	}
}
