package org.model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Player2 {

	protected int x=50;
	protected int y=60;
	protected Image image;
	
	public Player2() {
		this.setImage(image = new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Tron\\Tron\\Ressources\\images\\moto2.jpg").getImage());
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	
}
