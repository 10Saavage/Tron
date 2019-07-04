/**
 * 
 */
package org.model;

import junit.framework.TestCase;

/**
 * @author TOUSSI Manoel
 *
 */
public class Player1Test extends TestCase {

	Player1 p1= new Player1();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link org.model.Player1#getX()}.
	 */
	public void testGetX() {
		//fail("Not yet implemented");
		p1.setX(2);
		assertEquals(p1.getX(), 2);
	}

	/**
	 * Test method for {@link org.model.Player1#setX(int)}.
	 */
	public void testSetX() {
		//fail("Not yet implemented");
		p1.setX(1);
		int expectedX = p1.getX();
		assertEquals(expectedX, 1);
	}

	/**
	 * Test method for {@link org.model.Player1#getY()}.
	 */
	public void testGetY() {
		//fail("Not yet implemented");
		p1.setY(5);
		assertEquals(p1.getY(), 5);;
		
	}

	/**
	 * Test method for {@link org.model.Player1#setY(int)}.
	 */
	public void testSetY() {
		//fail("Not yet implemented");
		p1.setY(8);
		int expectedY = p1.getY();
		assertEquals(expectedY, 8);
	}

}
