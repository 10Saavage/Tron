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
	Collision collision = new Collision();
	protected static boolean play2 = true;
	

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(play2 == true) {
			collision.collisonFenetre2();
			collision.collisionOwnWall2();
			collision.collisionMurJoueur();
			collision.collisionj1j2();
			if (e.getKeyCode()==KeyEvent.VK_Z) {
				blue.add(new PointBleu(j2.getX(), j2.getY()));
				j2.setY(j2.getY()-1);
			}
		}
		if(play2 == true) {
			if (e.getKeyCode() == KeyEvent.VK_S){
				blue.add(new PointBleu(j2.getX(), j2.getY()));
				j2.setY(j2.getY()+1);
			}
		}
		if(play2 == true) {
			if (e.getKeyCode() == KeyEvent.VK_Q) {
				blue.add(new PointBleu(j2.getX(), j2.getY()));
				j2.setX(j2.getX()-1);
			}
		}
		if(play2 == true) {
			if (e.getKeyCode() == KeyEvent.VK_D) {
				blue.add(new PointBleu(j2.getX(), j2.getY()));
				j2.setX(j2.getX()+1);
			}
		}
	}

	
	
	

}
