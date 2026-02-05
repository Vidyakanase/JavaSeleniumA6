package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProductFromCart_002_Test {
	 WebDriver driver;
	@Test
	public void removeProductFromCartMethod() throws InterruptedException
	{
		
		BasePage bp= new BasePage(driver);
		bp.getElectronicsLnk();
		
		ElectronicsPage ep= new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getCellPhoneAddTocartButton().click();
		
		SoftAssert sa= new SoftAssert();
		 ShoppingCartPage scp= new ShoppingCartPage(driver);
		 scp.removeSmartPhoneMethod();
		
		try {
			if(scp.getSmartPhoneCartItem().isDisplayed()) {
				Reporter.log("Product is not removed from cart",true);
				
			}
		}
		catch(Exception e) {
			Reporter.log("Product is removed from cart!!",true);
		}
		sa.assertAll();
	}
	

}