package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Emp {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
     
      driver.get(" http://toolsqa.com/automation-practice-form/");
      Thread.sleep(2000);
      WebElement txtseli=driver.findElement(By.xpath("//label[text()='Selenium Commands']"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoview(true)", txtseli);
       Select s=new Select(txtseli);
       s.selectByIndex(2);
       s.selectByIndex(4);
       s.selectByIndex(6);
	}

}
