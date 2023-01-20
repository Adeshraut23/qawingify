package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import POM.HomePage;


public class Verify_Home_Page {
	
	
	static WebDriver driver;
	HomePage hp;

	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		
		driver = Base1.getDriver("chrome");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		hp = new HomePage(driver);
	}
	
	
	@Test
	public void verifyHomePage()
	{
		hp.moveToAmount();

		
	}
}
