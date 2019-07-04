package org.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BackgroundTest.class, BoolTimeTest.class, Player1Test.class, Player2Test.class, PointBleuTest.class,
		PointRougeTest.class })
public class AllTests {

}
