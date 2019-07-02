package org.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Background {
	protected Image image;
		
	/**
	 * 
	 */
	public Background() {
		this.setImage(image = new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Tron\\Tron\\Ressources\\images\\fond.jpg").getImage());
	}


	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	
	

}
