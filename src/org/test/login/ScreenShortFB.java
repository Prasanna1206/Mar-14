package org.test.login;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShortFB  {
	
	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi Prasana\\eclipse-workspace\\web\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//type casting
		TakesScreenshot tk = (TakesScreenshot)driver;
		//%temp%
		File f = tk.getScreenshotAs(OutputType.FILE);
		//destination
		System.out.println(f);
		File dest = new File("ss");
		//copy
	FileUtils.copyFile(f, dest);
	
	driver.quit();
		
	}

}
