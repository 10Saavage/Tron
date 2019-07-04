/**
 * 
 */
package org.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TOUSSI Manoel
 *
 */
public class PointRougeTest {
	PointRouge pr = new PointRouge(2, 2);

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
	 * Test method for {@link org.model.PointRouge#getX()}.
	 */
	@Test
	public void testGetX() {
		//fail("Not yet implemented");
		assertEquals(pr.getX(), 2);
	}

	/**
	 * Test method for {@link org.model.PointRouge#setX(int)}.
	 */
	@Test
	public void testSetX() {
		//fail("Not yet implemented");
		pr.setX(3);
		int expectedX = pr.getX();
		assertEquals(expectedX, 3);
	}

	/**
	 * Test method for {@link org.model.PointRouge#getY()}.
	 */
	@Test
	public void testGetY() {
		//fail("Not yet implemented");
		assertEquals(pr.getY(), 2);
	}

	/**
	 * Test method for {@link org.model.PointRouge#setY(int)}.
	 */
	@Test
	public void testSetY() {
		//fail("Not yet implemented");
		pr.setX(3);
		int expectedY = 3;
		assertEquals(expectedY, 3);
	}

}
