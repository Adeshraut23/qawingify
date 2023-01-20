package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Util;

public class HomePage extends Util {

	WebDriver driver;
	
	
	@FindBy(xpath="//table[@id='transactionsTable']/thead/tr/th[@id='amount']")
	private WebElement amount;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void moveToAmount()
	{
		Actions act = new Actions(driver);
		act.click(amount);
	}
	 

	}

	
	
