package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HamburgerMenu {
	
	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	By admin = By.xpath("//a[@title='Admin']/p/em");
	
	By serviceadvisor = By.xpath("//a[@href ='/serviceadvisor']") ;
	
	By locations = By.xpath("//a[@href ='/location']");
	
	By users  = By.xpath("//a[@href ='/userpage']");
	
	WebDriver driver;
	
	
	
	
	public HamburgerMenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	


	public WebElement Menu()
	{
		return driver.findElement(menu);
	}
	
	public WebElement Admin()
	{
		return driver.findElement(admin);
	}
	
	public WebElement ServiceAdvisor()
	{
		return driver.findElement(serviceadvisor);
	}

	public WebElement Location()
	{
		return driver.findElement(locations);
	}
	
	public WebElement Users()
	{
		return driver.findElement(users);
	}
	
	
}

