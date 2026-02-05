package orj.automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToANewTabOrWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htpps://manamchocolate.com/");
		Thread.sleep(200);
		//to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("htpps://www.ferrerorocher.com/in/en/");
		Thread.sleep(2000);
		//to open a new window
		driver.switchTo().newWindow(WindowType.TAB);
		driver. get("htpps://www.lepure.in/");
		Thread.sleep(200);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("htpps://fantasiechocolate.com/");

	}

}
