package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
	
		Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("D:\\Eclipse\\eclipse_workspace\\OcuityPortal\\src\\main\\java\\resources\\data.properties");
	 
	 prop.load(fis);
	 String BrowserName = prop.getProperty("browser");
	// System.out.println(BrowserName);
	// String BrowserURL = prop.getProperty("URL");
	 
	 
	 if (BrowserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_v-96\\chromedriver.exe");
		    driver = new ChromeDriver();
	 }
	 else if (BrowserName.equals("firefox"))
	 {
		 System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	        driver = new FirefoxDriver();
	 }
	 else if (BrowserName.equals("IE"))
	 {
		 
	 }
	 
	 driver.get(prop.getProperty("URL"));
	 driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
	 return driver;
	}
	
	
	
}
