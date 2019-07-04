/**
 * 
 */
package org.model;

import junit.framework.TestCase;

/**
 * @author TOUSSI Manoel
 *
 */
public class Player2Test extends TestCase {
	Player2 p2 = new Player2();

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link org.model.Player2#getX()}.
	 */
	public void testGetX() {
		//fail("Not yet implemented");
		p2.setX(2);
		assertEquals(p2.getX(), 2);
	}

	/**
	 * Test method for {@link org.model.Player2#setX(int)}.
	 */
	public void testSetX() {
		//fail("Not yet implemented");
		p2.setX(2);
		int expectedX = p2.getX();
		assertEquals(expectedX, 2);
	}

	/**
	 * Test method for {@link org.model.Player2#getY()}.
	 */
	public void testGetY() {
		//fail("Not yet implemented");
		p2.setY(2);
		assertEquals(p2.getY(), 2);
	}

	/**
	 * Test method for {@link org.model.Player2#setY(int)}.
	 */
	public void testSetY() {
		//fail("Not yet implemented");
		p2.setX(2);
		int expectedY = 2;
		assertEquals(expectedY, 2);
	}

}
