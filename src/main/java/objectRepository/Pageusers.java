package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageusers {
	


	By firstname = By.id("FirstName");
	
	By lastname = By.id("LastName");
	
	By email = By.id("Email");
	
	By phone = By.id("Phone");
	
	By role = By.id("rolename");
	
	By username = By.xpath("//input[@name='UniqueKey']");

	WebDriver driver;
	
	public Pageusers(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement FirstName() 
	{
	   return driver.findElement(firstname);	
	}
	
	public WebElement LastName() 
	{
	   return driver.findElement(lastname);	
	}
	
	public WebElement Email() 
	{
	   return driver.findElement(email);	
	}
	
	public WebElement Phone() 
	{
	   return driver.findElement(phone);	
	}
	
	public WebElement role() 
	{
	   return driver.findElement(role);	
	}

	
	public WebElement Username() 
	{
	   return driver.findElement(username);	
	}

}
