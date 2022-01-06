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
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
	
	prop = new Properties();
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	 
	 prop.load(fis);
	 String BrowserName = prop.getProperty("browser");
	// System.out.println(BrowserName);
	// String BrowserURL = prop.getProperty("URL");
	 
	 
	 if (BrowserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver_96\\chromedriver.exe");
		    driver = new ChromeDriver();
	 }
	 else if (BrowserName.equals("firefox"))
	 {
		 System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\drivers\\firefoxdriver\\geckodriver.exe");
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
