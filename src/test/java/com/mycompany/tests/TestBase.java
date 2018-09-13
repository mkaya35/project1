package com.mycompany.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import com.mycompany.pages.HomePage;
import com.mycompany.pages.PageFactoryBase;
import com.mycompany.util.Browser;
import com.mycompany.util.ExcelReader;


public class TestBase {

	protected WebDriver driver;
	protected HomePage homePage;
	protected static Properties testConfig;
	
	 
	@BeforeSuite
	public void  beforeSuit() throws FileNotFoundException, IOException {
		testConfig = new Properties();
		testConfig.load(new FileInputStream("TestConfig.properties"));
	}
		
	  @BeforeMethod
	  public void beforeMethod() throws MalformedURLException  
	  {
		 driver = Browser.createDriver(testConfig.getProperty("browser"));
		 driver.get(testConfig.getProperty("baseUrl"));
		 homePage = new HomePage(driver);
	  }
	 	 
	  @DataProvider
	  public Object[][] dataProvider(Method method)
	  {
		  ExcelReader ddh = new ExcelReader(testConfig.getProperty("mastertestdatafile"));
			
		Object[][] testData= ddh.getTestCaseDataSets(testConfig.getProperty("testdatasheet"), method.getName());
		
		return testData;
		 }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
		  Browser.quitDriver(driver);
	  }

}
