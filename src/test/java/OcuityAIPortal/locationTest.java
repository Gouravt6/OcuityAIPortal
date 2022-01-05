package OcuityAIPortal;

import org.testng.annotations.Test;

import objectRepository.pageLocation;

public class locationTest extends HomepageTest {

	@Test(priority = 5)
	public void addLocation()
	{
		pageLocation pl = new pageLocation(driver);
		pl.Menu().click();
		//pl.Admin().click();
		pl.Locations().click();
		pl.AddNew().click();
		pl.Name().sendKeys("New York");
		pl.Save().click();
		pl.OK().click();
	}
	
}
