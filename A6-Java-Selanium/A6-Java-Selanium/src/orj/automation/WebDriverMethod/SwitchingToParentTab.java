package orj.automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParentTab {

	public static void main(String[] args)throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossile.com/en-in/");
		//capturing the window id or handle parent or main tab
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.jokeranWatch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shop.timexindia.com/");
		//switching to parent  tab using the parents tab windows id
	   
		driver.switchTo().window(parentWindowId);
		
				


	
	}
}