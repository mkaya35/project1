package com.mycompany.tests;

import org.testng.annotations.Test;


public class ShopPageTest extends TestBase {
 
	
	
  @Test(dataProvider = "dpGeneral")
  public void testApplyingSortOrder(String sortOrder) {
	  
	 homePage.clickShopLink().setSortOrder(sortOrder).getSortOrder();
	 
	  
	  
  }
  
  
  

}
