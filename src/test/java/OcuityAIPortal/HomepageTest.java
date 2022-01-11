package OcuityAIPortal;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.HamburgerMenu;
import objectRepository.Pagelogin;
import resources.base;

public class HomepageTest extends base{
	
	public WebDriver driver;
	
	private static final int Priority = 0;
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	log.info("Driver is initialized");
	driver.get(prop.getProperty("URL"));
	log.info("Navigated to Login screen");
	}


    @Test(priority=1)
	public void loginTest() 
    {
		
		Pagelogin ln = new Pagelogin(driver);
		ln.Email().sendKeys(prop.getProperty("username"));
	    ln.Password().sendKeys(prop.getProperty("password"));
		ln.SignIn().click();   
		log.info("User is logged in");
		
	}
    
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
 
}




