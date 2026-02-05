package org.automation.ModulerFramework;

import org.automation.TestNGFrameWork.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest{
	@Test
	public void addToCartMethod() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLnk().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getCellPhoneAddTocartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cp.getProductAddToCartMsg().isDisplayed(),true,"Product is not added to cart!!");
		Thread.sleep(5000);
		
		sa.assertAll();
		
        
	}
	

}
