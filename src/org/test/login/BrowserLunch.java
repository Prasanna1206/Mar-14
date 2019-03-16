package org.test.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLunch {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuser=driver.findElement(By.id("email"));
		txtuser.sendKeys("prasana@gmail.com");
		WebElement txtvalue=driver.findElement(By.xpath("//div[text()='Create a new account']"));
		String text=txtvalue.getText();
		System.out.println(text);
		String te=txtuser.getAttribute("value");
		System.out.println(te);
		Thread.sleep(2000);
		
	}
	

}
