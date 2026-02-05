package Mock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToTheWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("file:///C:/Users/My%20Car%20Nexa/Downloads/Assign%20(8).html");
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        String parentWindow=driver.getWindowHandle();
        String expectedUrlPart = "https://www.zomato.com/";
        Set<String>allWindows = driver.getWindowHandles();
        for(String window : allWindows)
        {
         //  driver.switchTo().window(window);
          // if(driver.getCurrentUrl().contains("https://www.swiggy.com/"))
        	{
        		driver.manage().window().maximize(); 
        		System.out.println("Switched to desired child window");
        		Thread.sleep(3000);
        		driver.close();
        		break;
        		}
        }
	}
}
        	   
           
        
	


