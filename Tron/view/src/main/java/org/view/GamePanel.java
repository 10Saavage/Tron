package org.view;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import org.model.Background;


public class GamePanel extends JPanel {
	
	/**
	 * enlever le warning
	 */
	private static final long serialVersionUID = 1646853571417461449L;
	/**
	 * dessiner l'image d'arrière plan
	 */
	Background background = new Background();
	
	
	/**
	 *
	 */
	public void paintComponent(Graphics g) {
		
		g.drawImage(this.background.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		g.setColor(Color.RED);
		g.fillRect(Clavier.j1.getX(), Clavier.j1.getY(), 10, 10);
		g.setColor(Color.BLUE);
		g.fillRect(Clavier2.j2.getX(), Clavier2.j2.getY(), 10, 10);
		for(int i = 0 ; i < Clavier.red.size(); i++) {
			g.setColor(Color.RED);
			g.fillOval(Clavier.red.get(i).getX(), Clavier.red.get(i).getY(), 5, 5);
		}
		for(int i = 0 ; i < Clavier2.blue.size(); i++) {
			g.setColor(Color.BLUE);
			g.fillOval(Clavier2.blue.get(i).getX(), Clavier2.blue.get(i).getY(), 5, 5);
		}
		
		repaint();
	}
	
	
	

}
