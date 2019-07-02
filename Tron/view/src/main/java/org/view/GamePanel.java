package org.view;


import java.awt.Graphics;

import javax.swing.JPanel;

import org.model.Background;
import org.model.Player1;
import org.model.Player2;

public class GamePanel extends JPanel {
	Background background = new Background();
	
	public GamePanel() {
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(this.background.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		g.drawImage(Clavier.j1.getImage(), Clavier.j1.getX(), Clavier.j1.getY(), 35, 35, this);
		g.drawImage(Clavier2.j2.getImage(), Clavier2.j2.getX(), Clavier2.j2.getY(), 35, 35, this);
		
		repaint();
	}

}
