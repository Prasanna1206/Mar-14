package org.test.login;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hello {
	public static void main(String[] args)throws IOException {
	Base2 b1 = new Base2();
	WebDriver driver = b1.getDriver();
	b1.loadURL("https://www.facebook.com/");
	
	WebElement txtuserName = driver.findElement(By.xpath("//input[@type='email']"));
	b1.type(txtuserName, "padishk@gamail.com");
	WebElement txtPassword = driver.findElement(By.xpath("//div[@class='password']"));
	b1.type(txtPassword, "12344");
	
WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	
	b1.btnclick(txtPassword);
	b1.quitbrowser();
	}

	
	}

