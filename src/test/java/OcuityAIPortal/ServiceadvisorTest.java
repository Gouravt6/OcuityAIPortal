package OcuityAIPortal;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.pageServiceAdvisor;
import resources.base;

public class ServiceadvisorTest extends HomepageTest{
	
	
	
	@Test(priority=2)
	public void addServiceAdvisorTest()
	{
		
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		sa.Menu().click();
		sa.Admin().click();
		sa.ServiceAdvisor().click();
		sa.AddNew().click();
		sa.Name().sendKeys(prop.getProperty("addsa"));
		sa.Save().click();
		sa.OK().click();
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
		driver.navigate().refresh();
		
	
	}
}
