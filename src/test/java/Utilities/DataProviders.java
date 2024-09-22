package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.Utilities;


import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="login")
	public String[][] getdata() throws Exception
	{
		String path="D:\\study\\udemy\\project\\day_4_on_project\\Opencart_LoginData.xlsx";
	ExcelUtility util=new ExcelUtility(path);
	  int totalrow=util.getRowCount("Sheet1");
	  int colcount=util.getCellCount("Sheet1", 1);
	  String logindata[][]=new String[totalrow] [colcount];
	  for(int i=1;i<totalrow;i++)
	  {
		  for(int j=0;j<colcount;j++)
		  {
			  logindata[i][j]=util.getCellData("Sheet1", i, j);
		  }
	  }
	  return logindata;
	}
}
