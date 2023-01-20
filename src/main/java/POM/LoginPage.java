package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Util;

public class LoginPage extends Util {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='log-in']")
	private WebElement loginBtn;


	//constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//public methods
	public void enterUsername() throws IOException
	{
		username.sendKeys(getProperty("Username"));
	}
	
	
	public void enterPassword() throws IOException
	{
		password.sendKeys(getProperty("Password"));
	}
	
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}

}
