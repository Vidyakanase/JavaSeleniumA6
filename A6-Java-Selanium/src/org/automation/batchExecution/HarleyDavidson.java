package org.automation.batchExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidson 
{
  @Test
  public void launchingHearlyDevidson()
  {
	WebDriver driver =new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.harley-davidson.com/");
	Reporter.log("launched HearlyDevidson",true);
}
}


