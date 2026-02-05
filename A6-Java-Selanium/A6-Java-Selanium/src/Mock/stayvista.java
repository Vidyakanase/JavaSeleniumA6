package Mock;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stayvista
{
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.stayvista.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.xpath("//span[text()='Our Brands']")).click();
    driver.findElement(By.xpath("//span[text()='Explore']")).click();
    driver.findElement(By.id("com.stayvista.app:id/searchinput")).sendKeys("Goa");
    driver.findElement(By.id("com.stayvista.app:id/searchButton")).click();
    
    driver.navigate().refresh();
    
    WebElement searchResult = driver.findElement(By.id("com.stayvista.app:id/searchResult"));
    
    driver.navigate().refresh();
   // WebElement element =driver.findElement(By.xpath("))
    
    Assert.assertEquals(searchResult.isDisplayed(),true,"search result not displyed");
    Alert alert = driver.switchTo().alert();
    
		}
	}
	
 