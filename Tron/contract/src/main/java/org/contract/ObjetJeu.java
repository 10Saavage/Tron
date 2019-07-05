/**
 * 
 */
package org.contract;

/**
 * @author TOUSSI Manoel
 *
 */
public interface ObjetJeu {
	/**
	 * pour la collision avec la fenetre du joueur1
	 */
	public void collisonFenetre();
	/**
	 * pour la collision avec la fenetre du joueur2
	 */
	public void collisonFenetre2();
	/**
	 * pour la collison d'un joueur avec le mur adverse
	 */
	public void collisionMurJoueur();
	/**
	 * pour la collision des joueurs
	 */
	public void collisionj1j2();
	/**
	 * pour la collsion du joueur1 avec son propre mur
	 */
	public void collisionOwnWall();
	/**
	 * pour la collison du joueur2 avec son propre mur
	 */
	public void collisionOwnWall2();
	

}
