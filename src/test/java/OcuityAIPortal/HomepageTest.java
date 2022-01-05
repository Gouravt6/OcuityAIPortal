package OcuityAIPortal;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.loginPage;
import resources.base;

public class HomepageTest extends base{
	
	private static final int Priority = 0;

	@BeforeTest
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	}


    @Test(priority=1)
	public void loginTest() {
		
		loginPage ln = new loginPage(driver);
		ln.Email().sendKeys("autoai111@opentrash.com");
	    ln.Password().sendKeys("DMI@2021");
		ln.SignIn().click();                    
		
	}
}




