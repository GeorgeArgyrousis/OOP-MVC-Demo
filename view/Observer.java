package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Observer extends JPanel {
	
	/* serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* variables defining the dimensions of the frame */
	private final int BASE = 50, WIDTH = BASE * 16, HEIGHT = BASE * 9; 
	
	/* initialise all relevant components */
	public Observer() {
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	/* refresh the screen ie. calls the paintComponent method */
	public void render() {
		this.repaint();
	}
}
