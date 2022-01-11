package OcuityAIPortal;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HamburgerMenu;
import objectRepository.Pagelogin;
import objectRepository.pageLocation;
import objectRepository.pageServiceAdvisor;
import resources.base;

public class locationTest extends HomepageTest {
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
	@BeforeTest
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	log.info("Driver is initialized");
	driver.get(prop.getProperty("URL"));
	log.info("Navigated to Login screen");
	
	Pagelogin ln = new Pagelogin(driver);
	ln.Email().sendKeys(prop.getProperty("username"));
    ln.Password().sendKeys(prop.getProperty("password"));
	ln.SignIn().click();   
	log.info("User is logged in");
	}

	@Test(priority=1)
	public void addLocation()
	{
		
		HamburgerMenu hm = new HamburgerMenu(driver);
		pageLocation pl = new pageLocation(driver);
		hm.Menu().click();
		hm.Admin().click();
		hm.Location().click();
		
		//log.info("Navigated to the Location Page");
		pl.AddNew().click();
		pl.Name().sendKeys(prop.getProperty("addlocation"));
		pl.Save().click();
		pl.OK().click();
		log.info("Added a new Location");
		driver.navigate().refresh();
	}

	@Test(priority=2)
	public void editLocation() throws InterruptedException
	{
		pageLocation pl = new pageLocation(driver);
		//pl.Menu().click();
		WebElement element = driver.findElement(By.xpath("//table[@id='datatables']/tbody/tr/td/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		pl.Name().clear();
		pl.Name().sendKeys(prop.getProperty("editlocation"));
		pl.Save().click();
		pl.OK().click();
		log.info("Edited the location");
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void deleteLocation() throws InterruptedException 
	{
		pageLocation pl = new pageLocation(driver);
		
			WebElement element = driver.findElement(By.xpath("//table[@id='datatables']/tbody/tr/td/a"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
		pl.Delete().click();
		((List<WebElement>) pl.ConfirmDelete()).get(1).click();
		Thread.sleep(2000);
		pl.OK().click();
		log.info("Deleted the location");
		driver.navigate().refresh();
		
	
	}
	
	//@AfterTest
	//public void tearDown()
	{
		//driver.close();
	}
	
}
