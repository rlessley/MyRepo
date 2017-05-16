package com.revature.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

import com.revature.math.MathClass;

public class MyJUnitTest {
	MathClass mc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("======Before Class======");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("======After Class======");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("======Before============");
		mc = new MathClass();

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("======After============");

	}

	@Test
	public void test1() {
		System.out.println("======Test1==============");
		assertEquals("That's not correct at all!!!", 7, mc.addition(2, 5));
		
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("======Test2==============");
		assertEquals("That's not correct at all!!!", 3, mc.subtraction(5, 2));
	}
	
	@Test
	public void test3() {
		System.out.println("======Test3==============");
		assertEquals("That's not correct at all!!!", 10, mc.multiplication(2, 5));

	}
	
	@Test
	public void test4() {
		System.out.println("======Test4==============");
		assertEquals("That's not correct at all!!!", 3, mc.division(22, 7));

	}
	
	@Test(expected=TestTimedOutException.class,timeout=3000)
	public void test5() {
		System.out.println("======Timeout Test==============");
		String s = "";
		for(int i=0;i<100000;i++){
			s+="s";
		}
		assertEquals("That's not correct at all!!!", 3, 3);

	}
	
	@Test(expected=ArithmeticException.class)
	public void test6() {
		System.out.println("======Test6==============");
		//assertEquals("That's not correct at all!!!", "shoot", mc.division(22, 0));
		assertEquals("That's not correct at all!!!", 2, mc.division(4, 2));

	}

}
