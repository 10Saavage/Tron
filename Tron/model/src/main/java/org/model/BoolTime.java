/**
 * 
 */
package org.model;

/**
 * @author TOUSSI Manoel
 *
 */
public class BoolTime {
	
	/**
	 * pour la fin et le début du jeu
	 */
	protected boolean valeur;
	/**
	 *pour le temps de jeu 
	 */
	protected int time;
	/**
	 * pour le vainqueur du jeu
	 */
	protected String winner;
	
	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}
	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	/**
	 * @return the valeur
	 */
	public boolean isValeur() {
		return valeur;
	}
	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(boolean valeur) {
		this.valeur = valeur;
	}
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	
	

}
