package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class YahooGainers{

 
  public static void main(String[] args) throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mevlut\\Google Drive\\A-learn\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://finance.yahoo.com/gainers");


		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id=\"scr-res-table\"]/div[2]/table")));
		System.out.println("CellElement(1,2) : " + table.getCellElement(1, 2).getText());
		System.out.println("CellElement(2,2) : " + table.getCellElement(2, 2).getText());
	    System.out.println("CellElement(3,1) : " + table.getCellElement(3, 1).getText());
	    System.out.println("CellElement(5,2) : " + table.getCellElement(5, 2).getText());
	    System.out.println("CellElement(1,2) : " + table.getCellElement(1, 2).getText());
	  
	   System.out.println("Cell Text  which contains 'nium': " + table.getCellElement("nium").getText());
	    System.out.println("Column Count is                : " + table.getColumnCount());
	    System.out.println("Row Count is                   : " + table.getRowCount());
	   
	    System.out.println("Row text which all Cell        : " + table.getRowElement(3).getText());
	    System.err.println("Row text  which contains 'rata' : " + table.getRowElement("rata").getText());
	   
	  
	   String[] colText = table.getTextDisplayedInColumn(2);
	    System.out.println("");
	    System.out.println("Column 2 texts");
	    System.out.println("==========");
	   
	    for(String cell:colText)
	    {
	    	System.out.println(cell);
	    }
	    
	    String[] rowText = table.getTextDisplayedInRow(5);
	    System.out.println("");
	    System.out.println("Row 5 texts");
	    System.out.println("==========");
	    for(String cell:rowText)
	    {
	    	System.out.println(cell);
	    }
	    
	    
	    String[][] tableText = table.getTextDisplayedInAllRows();
	    System.out.println("");
	    System.out.println("   all table texts");
	    System.out.println("====================");
	   
	    for(String[] row:tableText)
	    {
	    	for(String cell:row)
	    	{
	    		System.out.print(cell+ "    ");
	    	}
	    	System.out.println("");
	    }
	 
	    Thread.sleep(5000);
	    driver.close();
	}
}
