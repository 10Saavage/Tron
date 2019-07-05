package org.view;

import javax.swing.JFrame;

/**
 * @author TOUSSI Manoel
 *
 */
public class GameFrame extends JFrame {
	
	
	/**
	 * enlever le warning
	 */
	private static final long serialVersionUID = -8065329797922290749L;
	/**
	 * la largeur de la fenetre
	 */
	public static int largFen=600;
	/**
	 * la hauteur de la fenetre
	 */
	public static int hautFen=400;
	/**
	 * pour gérer les déplacements du joueur 1
	 */
	Clavier clavierJ1 = new Clavier();
	/**
	 * pour gérer les déplacement du joueur 2
	 */
	Clavier2 clavierJ2 = new Clavier2();
	
	/**
	 * pour afficher la fenetre avec toutes les caractéristiques du Panel
	 */
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
