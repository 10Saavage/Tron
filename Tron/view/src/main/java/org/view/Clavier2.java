/**
 * 
 */
package org.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.model.Player2;

/**
 * @author TOUSSI Manoel
 *
 */
public class Clavier2 implements KeyListener {
	static Player2 j2 = new Player2();

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_Z) {
			j2.setY(j2.getY()-30);
		}
		if (e.getKeyCode() == KeyEvent.VK_S){
			j2.setY(j2.getY()+30);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			j2.setX(j2.getX()-30);
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			j2.setX(j2.getX()+30);
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
