package model;

import java.util.ArrayList;

import view.Observer;

public abstract class Observable {
	
	/* List of all the views */
	private ArrayList<Observer> observers; 
	
	/* Initialise the arraylist of observers */
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	/* Add an observer to the list */
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	/* Update the view of all the listed views */
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.render();
		}
	}
}
