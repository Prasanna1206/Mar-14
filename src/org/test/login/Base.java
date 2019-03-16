package org.test.login;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
public WebDriver screenshot()throws IOException{
	Date d=new Date();
	SimpleDateFormat s=new SimpleDateFormat("ddmmyyyyhhmmss");
	String n=s.format(d);
	TakesScreenshot tk = (TakesScreenshot)driver;
    File f=tk.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\screnshot\\"+ n +".png");
    FileUtils.copyFile(f,dest);
     Public getDriver() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	return driver;
    }
    Public void loadurl(String url) throws IOException  {
    	driver.get(url);
    	screenshot();
    	
    }
    public void quitBrowser() throws IOException {
    	driver.quit();
    }
    public void(webElement,String name) throws IOException {
    	element.sendkeys(name);
    	screenshot();
    }
    public void btnClick(webElement) throws IOException {
    	element.click;
    	screenshot();
    	
    	
    	
    	
}
    
    
}
private void getDriver() {
	// TODO Auto-generated method stub
	
}
}
