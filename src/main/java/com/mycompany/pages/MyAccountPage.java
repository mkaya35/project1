package com.mycompany.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageFactoryBase {

	
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public MyAccountPage loginAs(String username, String password)
	{
		loginUsername.sendKeys(username);
		loginPassword.sendKeys(password);
		loginButton.click();
		
		return new MyAccountPage(driver);
	}
	
	public boolean isLoginSuccesful(String username)
	{
		return islogin.getText().contains(username);
	}

}
