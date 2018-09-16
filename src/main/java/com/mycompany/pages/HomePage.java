package com.mycompany.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageFactoryBase {

	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	public MyAccountPage clickMyAccountLink()
	{
		myAccountButton.click();
		return new MyAccountPage(driver);
	}
	
	public MyAccountPage dashMenuOptions() {
		
		for(WebElement dashoption:dashlinks) {
			System.out.println(dashoption.getText());
		}
		return new MyAccountPage(driver);
		
	}
	
	
	public ShopPage clickShopLink()
	{
		shopButton.click();
		return new ShopPage(driver);
	}
	public ShopPage clickAboutUs()
	{
		about.click();
		return new ShopPage(driver);
	}
	
	
	public boolean validateAboutUs(){
		js.highlight(about, driver);
 		js.drawBorder(about, driver);
 		about.click();
 		return about.isDisplayed();
 	}
	
	public String getAbout() {
		 return  about.getText();
	}
	
	public boolean validateMyAccount(){
		js.highlight(myAccountButton, driver);
 		js.drawBorder(myAccountButton, driver);
 		myAccountButton.click();
 		return myAccountButton.isDisplayed();
 	}
	public boolean validateChkout(){
		js.highlight(checkoutButton, driver);
 		js.drawBorder(checkoutButton, driver);
 		checkoutButton.click();
 		return checkoutButton.isDisplayed();
 	}
	
	public boolean validateCart(){
		js.highlight(cartButton, driver);
 		js.drawBorder(cartButton, driver);
 		cartButton.click();
 		return cartButton.isDisplayed();
 	}
	public boolean validateShop(){
		js.highlight(shopButton, driver);
 		js.drawBorder(shopButton, driver);
 		shopButton.click();
 		return shopButton.isDisplayed();
 		 
 	}
	public boolean validateWebtable(){
		js.highlight(webTableButton, driver);
 		js.drawBorder(webTableButton, driver);
 		webTableButton.click();
 		return webTableButton.isDisplayed();
 		
 	}
	
	public boolean validateWaiting(){
		js.highlight(waitingButton, driver);
 		js.drawBorder(waitingButton, driver);
 		waitingButton.click();
 		return waitingButton.isDisplayed();
 		
 	}
	public boolean validateMainsite(){
		js.highlight(mainSiteButton, driver);
 		js.drawBorder(mainSiteButton, driver);
 		return mainSiteButton.isDisplayed();
 		
 	}
	
	public void readWebTableData() {
		webTableButton.click();
        WebElement wlist= driver.findElement(By.xpath("//*[@id=\"testaccounts\"]"));
		
		List<WebElement> listcols= wlist.findElements(By.xpath("//*[@id=\"testaccounts\"]/tbody/tr[1]/td"));
		System.out.println("Number of Columns= "+ listcols.size());	
		
		List<WebElement> listrows= wlist.findElements(By.xpath("//*[@id=\"testaccounts\"]/tbody/tr"));
		System.out.println("Number of Rows= "+ listrows.size());
		
				
		for(int i=0;i<listrows.size();i++) {
			System.out.println("Contents of the table: "+listrows.get(i).getText());
		
			
		}
	}
	
	
	
}
