package orj.automation.WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSizeOfBrowser {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://sharifbhai.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Hight :" +size.getHeight());
		System.out.println("Width :" +size.getWidth());

	}

}
