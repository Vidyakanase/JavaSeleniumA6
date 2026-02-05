package orj.automation.WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParticularTab {
	 

	public static void main(String[] args) throws InterruptedException
	{
	    String expectedUrl = "https:www.rolex.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossile.com/en-in/");
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.jokeranWatch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shop.timexindia.com/");
		
		Set<String> allwindowsIds = driver.getWindowHandles();
	
		for(String windowId : allwindowsIds)
		{
		   
			driver.switchTo().window(windowId);
			Thread.sleep(300);
			String actualUrl = driver.getCurrentUrl();
			//condition to break loop and to stop switching
			
			
			if(expectedUrl.equals(actualUrl))
			{
	         break;
		    } 
		}
	}
}
