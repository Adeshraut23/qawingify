package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	public static WebElement explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOf(element));
		return newElement;
	}
	
	public static String getProperty(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("configuration\\data.properties");
		Properties p = new Properties();
		p.load(file);
		String property = p.getProperty(key);
		return property;
	}
	
	public static void moveToElement(WebDriver driver, WebElement amount)
	{
		Actions act = new Actions(driver);
		act.moveToElement(amount).perform();
	}
	
	public static void moveMouse(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveByOffset(20, 20).click().build().perform();
	}
	

}
