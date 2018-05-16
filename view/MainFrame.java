package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	/* serialVersionUID */
	public static final long serialVersionUID = 1L;
	
	/* The title of the application */
	private final String TITLE = "Title";
	
	/* Constructs a new Frame. */
	public MainFrame(JPanel panel) {
		this.setTitle(TITLE);
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		this.pack();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
