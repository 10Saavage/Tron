package org.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Background {
	protected Image image;
	
	public Background() {
		this.setImage(image = new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Tron\\Tron\\Ressources\\images\\fond d'écran.jpg").getImage());
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	

}
