package org.automation.configrationAnnotations;

import org.automation.TestNGFrameWork.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_001_AddToCartTest extends BaseTest {
	@Test
	public void addToCart() throws InterruptedException 
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		WebElement productAddedMsg = driver.findElement(By.xpath("//p[text()=The product has been added to the cart"));
	}

}
