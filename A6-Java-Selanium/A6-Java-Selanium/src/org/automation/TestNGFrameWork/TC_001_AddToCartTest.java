package org.automation.TestNGFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001_AddToCartTest  extends BaseTest{
	@Test
	public void addToCart() 
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
}
}