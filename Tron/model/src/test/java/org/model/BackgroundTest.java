/**
 * 
 */
package org.model;

import static org.junit.Assert.*;


import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TOUSSI Manoel
 *
 */
public class BackgroundTest {
	/**
	 * pour le test de l'image
	 */
	Background bg =new Background();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.model.Background#getImage()}.
	 */
	@Test
	public void testGetImage() {
		//fail("Not yet implemented");
		Image image= new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Tron\\Tron\\Ressources\\images\\fond.jpg").getImage();
		assertEquals(image, bg.getImage());
	}

}
