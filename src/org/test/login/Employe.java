package org.test.login;

import java.rmi.server.SocketSecurityException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employe {
@BeforeClass
private void beforeclass(){
	// TODO Auto-generated method stub
	System.out.println("beforeclass");
}
@AfterClass
private void afterclass() {
	System.out.println("afterclass");
	
	// TODO Auto-generated method stub

}
@BeforeMethod
private void BeforeClass() {
	System.out.println("BeforeClass");
	
	// TODO Auto-generated method stub

}
@AfterMethod
private void aftermethoad() {
	System.out.println("aftermethoad");
	// TODO Auto-generated method stub

}

@Test
private void tess1() {
	// TODO Auto-generated method stub
System.out.println("test1");
}
@Test
private void test2() {
	// TODO Auto-generated method stub

}

}
