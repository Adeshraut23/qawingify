package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.Util;

public class Base1 {
	static WebDriver driver = null;
	
	
	
	public static WebDriver getDriver(String browser) throws IOException
	{
		System.out.print(driver);
		
		if(driver == null)
		{
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Browsers\\msedgedriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.get(Util.getProperty("url"));
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			return driver;
		}
		else
		{
			System.out.print("in else");
			return driver;
		}	
	}

}
