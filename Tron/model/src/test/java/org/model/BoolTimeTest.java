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
public class BoolTimeTest {
	/**
	 *pour le test des méthodes de la classe BoolTime 
	 */
	BoolTime bt = new BoolTime();

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
	 * Test method for {@link org.model.BoolTime#getWinner()}.
	 */
	@Test
	public void testGetWinner() {
		//fail("Not yet implemented");
		bt.setWinner("Manoel");
		assertEquals(bt.getWinner(), "Manoel");
	}

	/**
	 * Test method for {@link org.model.BoolTime#setWinner(java.lang.String)}.
	 */
	@Test
	public void testSetWinner() {
		//fail("Not yet implemented");
		bt.setWinner("jeu");
		String expectedStr = bt.getWinner();
		assertEquals(expectedStr, "jeu");
	}

	/**
	 * Test method for {@link org.model.BoolTime#isValeur()}.
	 */
	@Test
	public void testIsValeur() {
		//fail("Not yet implemented");
		bt.setValeur(true);
		assertEquals(bt.isValeur(), true);
	}

	/**
	 * Test method for {@link org.model.BoolTime#setValeur(boolean)}.
	 */
	@Test
	public void testSetValeur() {
		//fail("Not yet implemented");
		bt.setValeur(true);
		boolean expectedBool = bt.isValeur();
		assertEquals(expectedBool, true);
	}

	/**
	 * Test method for {@link org.model.BoolTime#getTime()}.
	 */
	@Test
	public void testGetTime() {
		//fail("Not yet implemented");
		bt.setTime(3);
		assertEquals(bt.getTime(), 3);
	}

	/**
	 * Test method for {@link org.model.BoolTime#setTime(int)}.
	 */
	@Test
	public void testSetTime() {
		//fail("Not yet implemented");
		bt.setTime(3);
		int expectedTime = bt.getTime();
		assertEquals(expectedTime, 3);
	}

}
