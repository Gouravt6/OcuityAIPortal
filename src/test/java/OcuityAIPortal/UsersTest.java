package OcuityAIPortal;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HamburgerMenu;
import objectRepository.Pagelogin;
import objectRepository.Pageusers;
import resources.base;

public class UsersTest extends base {
	
	
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());
	
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
	
	@Test
	public void edituser() throws InterruptedException
	{
		HamburgerMenu hm = new HamburgerMenu(driver);
		hm.Menu().click();
		hm.Admin().click();
		hm.Users().click();
		
		WebElement element = driver.findElement(By.xpath("//table[@id='datatables']/tbody/tr/td/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		
		Pageusers pg = new Pageusers(driver);
		
		
		pg.FirstName().clear();
		pg.FirstName().sendKeys(prop.getProperty("firstname"));
		pg.LastName().clear();
		pg.LastName().sendKeys(prop.getProperty("lastname"));
		pg.Email().clear();
		pg.Email().sendKeys(prop.getProperty("username"));
		pg.Phone().sendKeys(prop.getProperty("phone"));

//		Assert.assertEquals(pg.FirstName().getText(), (prop.getProperty("firstname")));
//		Assert.assertEquals(pg.LastName().getText(), (prop.getProperty("lastname")));
//		Assert.assertEquals(pg.Username().getText(), (prop.getProperty("username")));
//		Assert.assertEquals(pg.Email().getText(), (prop.getProperty("username")));
//		Assert.assertEquals(pg.Phone().getText(), (prop.getProperty("phone")));			
//		
	}
}
