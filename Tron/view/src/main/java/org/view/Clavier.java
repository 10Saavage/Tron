package org.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.model.Background;
import org.model.Player1;
import org.model.Player2;

public class Clavier implements KeyListener {
	static Player1 j1 = new Player1();
	
	

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			j1.setY(j1.getY()-30);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			j1.setY(j1.getY()+30);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			j1.setX(j1.getX()-30);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			j1.setX(j1.getX()+30);
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
