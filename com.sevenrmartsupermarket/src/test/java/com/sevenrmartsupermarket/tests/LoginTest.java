package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.ExcelReader;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class LoginTest extends Base
{
	LoginPage loginPage;
	HomePage homePage;
	ExcelReader excelReader=new ExcelReader();
@Test
public void verifyLoginFunctionality()
{
	loginPage=new LoginPage(driver);
	homePage=new HomePage(driver);
	loginPage.login();
	String actualProfileName=homePage.getProfilName();
	String expectedProfileName="Admin";
	Assert.assertEquals(actualProfileName, expectedProfileName,"Test failed - Login credentials not matching");
}
@Test
public void verifyUser()
{
	//faker class
	System.out.println(GeneralUtility.getRandumFullName());

}
@Test
public void verifyInvalidLoginErrorMessage()
{
	loginPage=new LoginPage(driver);
	loginPage.login("Admin123", "Admin333");
}
@Test
public void verifyStaffLogin()
{
	loginPage=new LoginPage(driver);
	homePage=new HomePage(driver);
	excelReader.setExcelFile("Login Data", "Staff credentials");
	String username=excelReader.getCellData(1, 0);
	String password=excelReader.getCellData(1, 1);
	loginPage.login(username, password);
	String actualProfileName=homePage.getProfilName();
	String expectedProfileName="Jonti";
	Assert.assertEquals(actualProfileName, expectedProfileName,"Actual name doesn't match to expected name");
}
}
