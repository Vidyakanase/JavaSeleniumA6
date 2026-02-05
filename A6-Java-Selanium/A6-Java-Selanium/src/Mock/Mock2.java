package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17"+Keys.ENTER);
        String price = driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB')]/../../../..//span[@class='a-price']")).getText();
        System.out.println(price);
         driver.findElement(By.xpath("//span[contains(text(),i''Phone 17 Pro 256 GB')]/../../../..//button[text()='Add to cart']")).click();
	}

}
