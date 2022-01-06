package OcuityAIPortal;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
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
		ln.Email().sendKeys(prop.getProperty("username"));
	    ln.Password().sendKeys(prop.getProperty("password"));
		ln.SignIn().click();                    
		
	}
}




