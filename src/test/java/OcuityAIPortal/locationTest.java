package OcuityAIPortal;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.pageLocation;

public class locationTest extends HomepageTest {

	pageLocation pl = new pageLocation(driver);
	@Test(priority = 5)
	public void addLocation()
	{
		//pageLocation pl = new pageLocation(driver);
		pl.Menu().click();
		//pl.Admin().click();
		pl.Locations().click();
		pl.AddNew().click();
		pl.Name().sendKeys("New York");
		pl.Save().click();
		pl.OK().click();
	}

	@Test(priority=6)
	public void EditLocation()
	{
		//pageLocation pl = new pageLocation(driver);
		//pl.Menu().click();
		pl.Edit().click();
		pl.Name().sendKeys("Dallas");
		pl.Save().click();
		pl.OK().click();
	}

	
}
