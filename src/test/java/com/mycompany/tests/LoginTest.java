package com.mycompany.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends TestBase {

  @Test(dataProvider="dataProvider")
  public void testSuccessfulLogin(String username, String password)
  {
	boolean testResult = homePage.clickMyAccountLink()
			                    .loginAs(username, password)
			                    .isLoginSuccesful(username);
	
	homePage.dashMenuOptions();
	
	
	Assert.assertTrue(testResult, "Error:Login is not Succesful for user " + username );
  }
  
}
