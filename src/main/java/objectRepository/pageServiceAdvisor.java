package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageServiceAdvisor {
	

	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	//By menu = By.id("minimizeSidebar");
	
	By admin = By.xpath("//a[@title='Admin']/p/em");
	
	By serviceadvisor = By.xpath("//a[@href ='/serviceadvisor']") ;
	
	By addNew = By.xpath("//div[@class='card-content']/div/button/em");
	
	By name = By.id("Name");
	
	By save = By.xpath("//button[@type='submit']");
	
	By ok = By.xpath("//div[@class='swal2-buttonswrapper']/button");
	
	By edit = By.xpath("//table[@id='datatables']/tbody/tr/td/a");
	
	By cancel = By.xpath("//div[@class='col-md-12']/div[4]/div/button");
	
	By delete = By.xpath("//div[@class='col-md-12']/div/div/button");
	
	WebDriver driver;
	
	
	


	public pageServiceAdvisor(WebDriver driver) {
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
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}

	public WebElement Edit()
	{
		return driver.findElement(edit);
	}
	
	public WebElement Cancel()
	{
		return driver.findElement(cancel);
	}
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
}

