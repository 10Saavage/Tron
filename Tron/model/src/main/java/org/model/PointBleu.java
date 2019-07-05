/**
 * 
 */
package org.model;


/**
 * @author TOUSSI Manoel
 *
 */
public class PointBleu {

	/**
	 * position x
	 */
	protected int x;
	/**
	 * position y
	 */
	protected int y;
	
	
	/**
	 * @param x position x
	 * @param y position y
	 */
	public PointBleu(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
