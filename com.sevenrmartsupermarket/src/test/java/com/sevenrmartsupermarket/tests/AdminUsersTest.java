package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUsersPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.ExcelReader;

public class AdminUsersTest extends Base {
	LoginPage loginPage;
	AdminUsersPage adminUsersPage;
	ExcelReader excelReader=new ExcelReader();
	
	
	@Test
	public void verifyAdminusersCreation()
	{
		loginPage=new LoginPage(driver);
		adminUsersPage=new AdminUsersPage(driver);
		loginPage.login();
		excelReader.setExcelFile("Admin Users", "AdminUsers");
		String username=excelReader.getCellData(1, 0);
		String password=excelReader.getCellData(1, 1);
		String usertype=excelReader.getCellData(1, 2);
		adminUsersPage.createAdminUsers(username,password,usertype);
	}
	

}
