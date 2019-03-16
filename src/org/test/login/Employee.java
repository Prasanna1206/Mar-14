package org.test.login;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Employee {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		driver.get(" http://toolsqa.com/automation-practice-form/");
	      Thread.sleep(2000);
	      WebElement txtseli=driver.findElement(By.xpath("//label[text()='Selenium Commands']"));
	      Select s=new Select(txtseli);
	      List<WebElement> ad=s.getOptions();
	      for(int i=0;i<ad.size();i++)
	       
	    	  
	    	  if(i%2==0)
	    	  {
	    		  WebElement txtseli1=ad.get(i);
	    		  String s1=txtseli1.getText();
	    		  System.out.println(s1);
	    		  driver.quit();
	    		  
	    	  }
	      }
	}


