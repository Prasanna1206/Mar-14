package org.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}
	@Before
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@After
	public void aftermethoa() {
		System.out.println("aftermethod");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
		
	
	}
	
	
	


