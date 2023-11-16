package com.sevenrmartsupermarket.constants;

import org.testng.annotations.DataProvider;

public class Constants 
{
	//To get projectpath+config path
	public static final String CONFIG_FILE_PATH=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	public static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFiles\\";
	public static final String EXTENT_REPORT_PATH = System.getProperty("user.dir")+"\\ExtentReport";
	

	   										/**Expected Results**/
	/**Login Page**/
	
											/**Data Providers**/
	//@DataProvider(name="User login")
	//public Object[][] (("admin","admin"),("Vinay","Test"))
}
