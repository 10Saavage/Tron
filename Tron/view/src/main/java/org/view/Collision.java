/**
 * 
 */
package org.view;

import org.contract.ObjetJeu;

/**
 * @author TOUSSI Manoel
 *
 */
public class Collision extends ObjetJeu {
	
	public Collision() {
		this.CollisionMurJoueur();
		this.CollisonFenetre();
	}

	@Override
	public void CollisonFenetre() {
		// TODO Auto-generated method stub
		if (Clavier.j1.getX() == 0) {
			Clavier.j1.setX(GameFrame.largFen);		
		}
		if (Clavier.j1.getX() == GameFrame.largFen) {
			Clavier.j1.setX(0);
		}
		if (Clavier.j1.getY() == 0) {
			Clavier.j1.setX(GameFrame.hautFen);
		}
		if (Clavier.j1.getY() == GameFrame.hautFen) {
			Clavier.j1.setY(0);
		}
	}


	@Override
	public void CollisionMurJoueur() {
		// TODO Auto-generated method stub
		for(int i = 0; i < Clavier.red.size(); i++) {
			//QUAND IL RENCONTRE LE MUR ADVERSE
			if(Clavier.red.get(i).getX() == Clavier2.j2.getX() && Clavier.red.get(i).getY() == Clavier2.j2.getY()){
				
			}
			// QUAND IL RENCONTRE LE MUR ADVERSE
			if(Clavier2.blue.get(i).getX() == Clavier.j1.getX() && Clavier2.blue.get(i).getY() == Clavier.j1.getY()) {
				
			}
			//QUAND IL RENCONTRE SON PROPRE MUR
			if(Clavier2.blue.get(i).getX() == Clavier2.j2.getX() && Clavier2.blue.get(i).getY() == Clavier2.j2.getY()) {
			
			}
			//QUAND IL RENCONTRE SON PROPRE MUR	
			if(Clavier.red.get(i).getX() == Clavier.j1.getX() && Clavier.red.get(i).getY() == Clavier.j1.getY() ){
				
			}
			if(Clavier.j1.getX() == Clavier2.j2.getX() && Clavier.j1.getY() == Clavier2.j2.getY() ) {
				
			}
			
			
		}
		
	}

}
