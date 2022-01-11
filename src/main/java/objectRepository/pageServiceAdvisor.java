package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageServiceAdvisor {
	
	
	By addNew = By.xpath("//div[@class='card-content']/div/button/em");
	
	By name = By.id("Name");
	
	By save = By.xpath("//button[@type='submit']");
	
	By ok = By.xpath("//button[contains(text(),'OK')]");
	
	//By edit = By.xpath("//table[@id='datatables']/tbody/tr/td/a");
	//((JavascriptExecutor)driver).executeScript("arguments[0].click();
	
	By cancel = By.xpath("//div[@class='col-md-12']/div[4]/div/button");
	
	By delete = By.xpath("//div[@class='col-md-12']/div/button");
	
	By confirmDelete = By.xpath("//*[(text()='Delete')]");
	
	WebDriver driver;
	
	
	


	public pageServiceAdvisor(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
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

	//public WebElement Edit()
		//return driver.findElement(edit);
	
	
	public WebElement Cancel()
	{
		return driver.findElement(cancel);
	}
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
	
	public List<WebElement> ConfirmDelete()
	{
		return driver.findElements(confirmDelete);
	}
}

