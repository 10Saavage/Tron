package org.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8065329797922290749L;
	public static int largFen=600;
	public static int hautFen=400;
	Clavier clavierJ1 = new Clavier();
	Clavier2 clavierJ2 = new Clavier2();
	
	public GameFrame() {
		GamePanel gamepanel = new GamePanel();
		this.setTitle("Tron");
		this.setSize(largFen, hautFen);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(gamepanel);
		this.setVisible(true);
		this.addKeyListener(this.clavierJ1);
		this.addKeyListener(this.clavierJ2);
	}

}
