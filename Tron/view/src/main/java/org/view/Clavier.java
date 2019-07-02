package org.view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import org.model.PointRouge;
import org.model.Player1;


public class Clavier implements KeyListener {
	static Player1 j1 = new Player1();
	static ArrayList <PointRouge> red = new ArrayList<PointRouge>();

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			red.add(new PointRouge(j1.getX(), j1.getY()));
			j1.setY(j1.getY()-2);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			red.add(new PointRouge(j1.getX(), j1.getY()));
			j1.setY(j1.getY()+2);		
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			red.add(new PointRouge(j1.getX(), j1.getY()));
			j1.setX(j1.getX()-2);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			red.add(new PointRouge(j1.getX(), j1.getY()));
			j1.setX(j1.getX()+2);


		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
