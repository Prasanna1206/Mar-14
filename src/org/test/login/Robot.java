package org.test.login;

import java.awt.event.KeyEvent;
import java.awt.peer.RobotPeer;

import java.awt.peer.RobotPeer;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement s=driver.findElement(By.id("email"));
		Actions acc=new Actions(driver);
		acc.contextClick(s).perform();
		acc.doubleClick(s).perform();
		acc.keyDown(s,Keys.SHIFT).sendKeys(s,"hello").keyUp(s,Keys.SHIFT).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		
	}

}
