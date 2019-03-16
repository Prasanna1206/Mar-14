package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employee1  {
	public static void main(String[] args) throws Exception {
		Base b=new Base();
		WebDriver driver=b.getDriver();
		b.loadUrl("https://facebook.com");
		WebElement txtusername=driver.findElement(By.id("email"));
		b.type(txtusername),"JAVA");
		WebElement txtpass=driver.findElement(By.id("pass"));
		b.type(txtpass,"Greens");
		
		
		
		
		
	}

}
