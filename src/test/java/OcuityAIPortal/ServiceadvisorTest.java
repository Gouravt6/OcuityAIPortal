package OcuityAIPortal;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.pageServiceAdvisor;
import resources.base;

public class ServiceadvisorTest extends HomepageTest{
	
	@Test(priority=2)
	public void addServiceAdvisorTest() throws IOException
	{
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		sa.Menu().click();
		sa.Admin().click();
		sa.ServiceAdvisor().click();
		sa.AddNew().click();
		sa.Name().sendKeys(prop.getProperty("serviceadvisoradd"));
		sa.Save().click();
		sa.OK().click();
		
	}
	
	@Test(priority=3)
	public void editServiceAdvisorTest()
	{
		pageServiceAdvisor saEdit = new pageServiceAdvisor(driver);
		saEdit.Edit().click();
		saEdit.Cancel().click();
		saEdit.Edit().click();
		saEdit.Name().clear();
		saEdit.Name().sendKeys(prop.getProperty("serviceadvisoredit"));
		saEdit.Save().click();
		saEdit.OK().click();
		}
	
	@Test(priority=4)
	public void deleteServiceAdvisor() {
		
		pageServiceAdvisor saDel = new pageServiceAdvisor(driver);
		
		saDel.Edit().click();
		saDel.Delete().click();
		
	}

}
