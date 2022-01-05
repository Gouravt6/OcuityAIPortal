package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hamburgerMenu {
	
	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	By admin = By.xpath("//a[@title='Admin']/p/em");
	
	By serviceadvisor = By.xpath("//a[@href ='/serviceadvisor']") ;
	
	By addNew = By.xpath("//div[@class='card-content']/div/button/em");
	
	By name = By.id("Name");
	
	By save = By.xpath("//button[@type='submit']");
	
	WebDriver driver;
	
	
	
	
	public hamburgerMenu(WebDriver driver) {
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

	public WebElement AddNew()
	{
		return driver.findElement(addNew);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	
}

