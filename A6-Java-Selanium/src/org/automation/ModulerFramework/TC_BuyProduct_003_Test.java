package org.automation.ModulerFramework;

import org.automation.genericUtilities.Flib;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest
{
	@Test
	public void byProductMethod()
	{
		BasePage bp= new BasePage(driver);
		bp.getElectronicsLnk().click();
		
		ElectronicsPage ep= new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getCellPhoneAddTocartButton().click();
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(cpp.getProductAddToCartMsg().isDisplayed(),true,"Product is not added to the cart !!");
		
		bp.getShoppingCartLink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartPhoneCartItem().click();
		scp.getTermsOfServiceCheckbox().click();
		scp.getCheckOutButton().click();
		
        String city = Flib.getWorkbookCellValue("buyproductcreads",1,0);
        String address1 = Flib.getWorkbookCellvalue("buyproductcreds",1,1);
       // String pinCode = Flib.getNumericCellValue("buyproductcreds",1,2);
       // String contact = Flib.getNumericCellValue("buyproductcreds",1,3);
        Flib.getNumericCellValueMethod("buyproductcreds"1,2);
        Flib.getNumericCellValueMethod("buyproductcreds",1,3);
        
        int rn = Flib.generateRandomNo();
        String phoneNo = contact+rn;

         CheckOutPage cop = new CheckOutPage(driver);
         cop.buyProduct(city, address1, pinCode, phoneNo);
         
         CompletePage comp = new CompletePage(driver);
         sa.assertEquals(comp.getOrderPlaceMsg().isDisplayed(),true,"Order is not processed!");
         
	        
}
}