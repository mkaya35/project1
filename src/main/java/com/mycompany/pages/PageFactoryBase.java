package com.mycompany.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryBase {
	
	//private WebDriver driver;
	protected WebDriver driver;
	JSEHelper js = new JSEHelper();
	
	public PageFactoryBase(WebDriver driver) 
    {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//PAGE FACTORY
	    //About Us Menu
		@FindBy(xpath="//a[@title='About Us']")
		WebElement about;
		
		//My Account Menu
		@FindBy(xpath="//a[@title='My account']")  //a[contains(text(),'My account')]
		WebElement myAccountButton;
		//Checkout menu
		@FindBy(xpath="//a[@title='Checkout']")
		WebElement checkoutButton;
		//Cart menu
		@FindBy(xpath="//a[@title='Cart']")
		WebElement cartButton;
		
		//webTable menu
		@FindBy(xpath="//a[@title='webTable']")
		WebElement webTableButton;
		
		//waiting menu
		@FindBy(xpath="//a[@title='waiting']")
		WebElement waitingButton;
		
		//Main Site menu
		@FindBy(xpath="//a[@title='Main Site']")
		WebElement mainSiteButton;
				
		//Shop Menu		
		@FindBy(xpath="//a[contains(text(),'Shop')]")
		WebElement shopButton;
		
		//Login Username
		@FindBy(xpath="//input[@id='username']")
		WebElement loginUsername;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement loginPassword;
		
		@FindBy(xpath="//input[@name='login']")
		WebElement loginButton;
		
		@FindBy(xpath="//strong[2]")
		WebElement islogin;
	
		@FindBy(name="orderby")
		WebElement selectBox;
		
		@FindBy(xpath="//nav[@class='woocommerce-MyAccount-navigation']")
		
		List<WebElement> dashlinks;
		
	
		
		
	public String getTitle() {
		return driver.getTitle();
	}
	
	
}
