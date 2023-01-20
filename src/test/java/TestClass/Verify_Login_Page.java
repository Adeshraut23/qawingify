package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import POM.LoginPage;

@Test
public class Verify_Login_Page {

	static WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		
		driver = Base1.getDriver("chrome");

	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		lp = new LoginPage(driver);
	}
	
	public void verifyLoginPage() throws IOException, InterruptedException
	{
     lp.enterUsername();
     lp.enterPassword();
     lp.clickLoginBtn();		
     
	}
	
	
}
