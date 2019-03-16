package org.test.login;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 {
	WebDriver driver;
	
	public void Screenshot()throws IOException {
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("ddmmyyyyhhmmss");
		String n = s.format(d);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\Lakshmi Prasana\\\\eclipse-workspace\\\\web\\\\Driver\\\\screenshot\\"+ n + ".png");
		FileUtils.copyFile(f, dest);
	}
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
    	driver=new ChromeDriver();
		return driver;
	}
	public void loadURL(String url) throws IOException {
		driver.get(url);
		Screenshot();

	}
	public void quitbrowser() {
		driver.quit();

	}
	
	public void type(WebElement element ,String name) throws IOException {
		element.sendKeys(name);
		Screenshot();
	}
	public void btnclick(WebElement element ) throws IOException {
		element.click();
		Screenshot();
		
	}

}
