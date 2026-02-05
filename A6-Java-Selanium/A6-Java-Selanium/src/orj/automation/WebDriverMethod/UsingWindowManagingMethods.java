package orj.automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWindowManagingMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver ();
		driver.get("https//www.Suzukimotercycle.co.in/");
		driver. manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}

}
