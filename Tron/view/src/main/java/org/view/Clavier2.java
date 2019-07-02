/**
 * 
 */
package org.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import org.model.Player2;
import org.model.PointBleu;


/**
 * @author TOUSSI Manoel
 *
 */
public class Clavier2 implements KeyListener {
	static Player2 j2 = new Player2();
	static ArrayList <PointBleu> blue = new ArrayList<PointBleu>();

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_Z) {
			blue.add(new PointBleu(j2.getX(), j2.getY()));
			j2.setY(j2.getY()-2);
		}
		if (e.getKeyCode() == KeyEvent.VK_S){
			blue.add(new PointBleu(j2.getX(), j2.getY()));
			j2.setY(j2.getY()+2);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			blue.add(new PointBleu(j2.getX(), j2.getY()));
			j2.setX(j2.getX()-2);
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			blue.add(new PointBleu(j2.getX(), j2.getY()));
			j2.setX(j2.getX()+2);
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
