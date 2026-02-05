package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stayvista2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.stayvista.com/");
		driver.findElement(By.xpath("//span[text()='Explore']")).click();
		driver.findElement(By.xpath("//button[text()=\"I'll do it later\"]")).sendKeys();
		
		
	}

}
