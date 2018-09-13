package com.mycompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopPage extends PageFactoryBase {
	

	
	public ShopPage(WebDriver driver)
	{
		super(driver);
	}
	
	public ShopPage setSortOrder(String sortOrder)
	{
		Select sortList = new Select(selectBox);
		sortList.selectByVisibleText(sortOrder);
		return new ShopPage(driver);
	}

	public String getSortOrder()
	{
		Select sortList = new Select(selectBox);
		return sortList.getFirstSelectedOption().getText();
	}
}
