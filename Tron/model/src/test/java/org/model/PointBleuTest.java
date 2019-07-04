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
public class PointBleuTest {
	PointBleu pb = new PointBleu(2, 2);

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
	 * Test method for {@link org.model.PointBleu#getX()}.
	 */
	@Test
	public void testGetX() {
		//fail("Not yet implemented");
		assertEquals(pb.getX(), 2);
		
	}

	/**
	 * Test method for {@link org.model.PointBleu#setX(int)}.
	 */
	@Test
	public void testSetX() {
		//fail("Not yet implemented");
		pb.setX(3);
		int expectedX = pb.getX();
		assertEquals(expectedX, 3);		
	}

	/**
	 * Test method for {@link org.model.PointBleu#getY()}.
	 */
	@Test
	public void testGetY() {
		//fail("Not yet implemented");
		assertEquals(pb.getY(), 2);
	}

	/**
	 * Test method for {@link org.model.PointBleu#setY(int)}.
	 */
	@Test
	public void testSetY() {
		//fail("Not yet implemented");
		pb.setY(3);
		int expectedY = 3;
		assertEquals(expectedY, 3);
	}

}
