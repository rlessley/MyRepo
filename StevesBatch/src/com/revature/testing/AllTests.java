package com.revature.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyJUnitTest.class, MyJUnitTest2.class, MyJUnitTest3.class })
public class AllTests {

}
