package org.test.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	
	public static WebDriver driver;
	@Parameters({"username","password"})
	@Test
	public static void beforeClass(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement txtuser=driver.findElement(By.id("email"));
			txtuser.sendKeys(s1);
WebElement pass=driver.findElement(By.id("pass"));// TODO Auto-generated method stub
			pass.sendKeys(s2);
WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
			driver.quit();
			}
}


