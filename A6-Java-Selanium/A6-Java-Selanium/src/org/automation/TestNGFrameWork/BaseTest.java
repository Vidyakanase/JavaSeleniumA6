package org.automation.TestNGFrameWork;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	@BeforeClass
	public void browserSetUp()
	{
		String browserValue=Flib.getPropertyValue("Chrome");
		Flib.getPropertyValue("Url");
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("Url");
	}
	@BeforeMethod
	public void login()
	{
		String email = Flib.getPropertyValue("Email");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email:")).sendKeys("");
		driver.findElement(By.id("Password:")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

@AfterMethod
public void logout()
{
	driver.findElement(By.linkText("Log Out")).click();
}
@AfterClass
public void browserTearDown()
{
	driver.quit();
	
}
}
