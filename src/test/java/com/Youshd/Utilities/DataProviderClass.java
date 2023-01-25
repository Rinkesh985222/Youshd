package com.Youshd.Utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="LoginData")
	public String[][] LoginDataProvider(Method name) throws IOException {
		

		String fileName= "C:\\Users\\admin\\Desktop\\framework\\Youshd\\TestData\\DataProvider.xlsx";
		int ttlRows=ReadExcel.getRowCount(fileName, "Sheet5");
		int ttlColumns=ReadExcel.getColCount(fileName, "Sheet5");
		
		
		String data[][]=new String[ttlRows-1][ttlColumns-4];
		
		if(name.getName().equals("enterPhoneNumber")) {
        for(int i=1;i<2;i++) {
			for(int j=2;j<3;j++) {
             data[i-1][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
			}
		}
		}
		
		return data;
		
	}
		
		@DataProvider(name="instaLoginData")
		public String[][] instaLoginDataProvider(Method name) throws IOException {
			

			String fileName= "C:\\Users\\admin\\Desktop\\framework\\Youshd\\TestData\\DataProvider.xlsx";
			int ttlRows=ReadExcel.getRowCount(fileName, "Sheet5");
			int ttlColumns=ReadExcel.getColCount(fileName, "Sheet5");
			
			String data[][]=new String[ttlRows-1][ttlColumns-3];
			
        
        if(name.getName().equals("clickOnInstagram")) {
            for(int i=1;i<2;i++) {
    			for(int j=3;j<5;j++) {
                 data[i-1][j-3]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
           
    			}
    		}
        
  		}
         
		return data;
	
	}

	

}
