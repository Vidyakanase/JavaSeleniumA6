package orj.automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToAnActiveElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htpps://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("bahubali chapter2");

	}

}
