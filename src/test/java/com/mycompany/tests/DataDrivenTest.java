package com.mycompany.tests;

import com.mycompany.util.ExcelReader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		
		ExcelReader ddh = new ExcelReader("MasterTestDataFile.xlsx");
		Object[][] testData= ddh.getTestCaseDataSets("TestCaseDataSets", "testSuccessfulLogin");
		//Object[][] testData= ddh.getTestCaseDataSets("TestCaseDataSets", "testApplyingSortOrder");
		
		for(Object[] testRow:testData)
		{
			for(Object cell:testRow)
			{
				System.out.print(cell.toString()+"    ");
			}
			System.out.println();
		}
		
		

	}

}
