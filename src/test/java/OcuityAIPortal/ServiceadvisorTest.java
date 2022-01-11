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
import objectRepository.pageServiceAdvisor;
import resources.base;

public class ServiceadvisorTest extends base{
	
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
	
	
	@Test(priority=2)
	public void addServiceAdvisorTest()
	{
		HamburgerMenu hm = new HamburgerMenu(driver);
		
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		hm.Menu().click();
		hm.Admin().click();
		hm.ServiceAdvisor().click();
		log.info("Navigated to the Service Advisor page");
		sa.AddNew().click();
		sa.Name().sendKeys(prop.getProperty("addsa"));
		sa.Save().click();
		sa.OK().click();
		log.info("Added New service Advisor");
		driver.navigate().refresh();
		
	
	}
	
	@Test(priority=3)
	public void editServiceAdvisorTest() throws InterruptedException
	{
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		WebElement element = driver.findElement(By.xpath("//table[@id='datatables']/tbody/tr/td/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		sa.Name().clear();
		sa.Name().sendKeys(prop.getProperty("editsa"));
		sa.Save().click();
		sa.OK().click();
		log.info("Edited the Service Advisor");
		driver.navigate().refresh();
}	
	
	
	@Test(priority=4)
	public void deleteServiceAdvisor() throws InterruptedException 
	{
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		
			WebElement element = driver.findElement(By.xpath("//table[@id='datatables']/tbody/tr/td/a"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
		sa.Delete().click();
		((List<WebElement>) sa.ConfirmDelete()).get(1).click();
		Thread.sleep(2000);
		sa.OK().click();
		log.info("Deleted the service Advisor");
		driver.navigate().refresh();
		
	
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}

