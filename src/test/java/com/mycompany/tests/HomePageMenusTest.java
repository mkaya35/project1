package com.mycompany.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycompany.pages.PageFactoryBase;
import com.mycompany.pages.ShopPage;

public class HomePageMenusTest extends TestBase{
	
		
	
 @Test (priority=1)
  
  public void validateAbout(){
		
		boolean flag = homePage.validateAboutUs();
		Assert.assertTrue(flag);
		
		System.out.println(homePage.getTitle());
				
 }
  @Test(priority=2)
  public void validateMyAcount(){
		
		boolean flag = homePage.validateMyAccount();
		Assert.assertTrue(flag);  
		System.out.println(homePage.getTitle());
  }
  @Test(priority=3)
  public void validateCheckout(){
		
		boolean flag = homePage.validateChkout();
		Assert.assertTrue(flag);  
		System.out.println(homePage.getTitle());
}
  @Test(priority=4)
  public void validateScart(){
		
		boolean flag = homePage.validateCart();
		Assert.assertTrue(flag); 
		System.out.println(homePage.getTitle());
}
  @Test(priority=5)
  public void validateMshop(){
		
		boolean flag = homePage.validateShop();
		Assert.assertTrue(flag); 
		
		System.out.println(homePage.getTitle());
		
		
}
@Test(priority=6)
  public void validateMwebtable(){
		
		boolean flag = homePage.validateWebtable();
		Assert.assertTrue(flag);  
		System.out.println(homePage.getTitle());
		
		WebElement wlist= driver.findElement(By.xpath("//*[@id=\"testaccounts\"]"));
		
		List<WebElement> listcols= wlist.findElements(By.xpath("//*[@id=\"testaccounts\"]/tbody/tr[1]/td"));
		System.out.println("Number of Columns= "+ listcols.size());	
		
		List<WebElement> listrows= wlist.findElements(By.xpath("//*[@id=\"testaccounts\"]/tbody/tr"));
		System.out.println("Number of Rows= "+ listrows.size());
		
				
		for(int i=0;i<listrows.size();i++) {
			System.out.println("Contents of the table: "+listrows.get(i).getText());
		
			
		}
		
}
  @Test(priority=7)
  public void validateMwaiting(){
		
		boolean flag = homePage.validateWaiting();
		Assert.assertTrue(flag); 
		System.out.println(homePage.getTitle());
		
}
  @Test(priority=8)
  public void validateMmainsite(){
		
		boolean flag = homePage.validateMainsite();
		Assert.assertTrue(flag); 
		
}
  
}
