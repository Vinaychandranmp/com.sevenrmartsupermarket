package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.PushNotificationsPage;
import com.sevenrmartsupermarket.utilities.ExcelReader;

public class PushNotificationsTest extends Base
{
	LoginPage loginPage;
	PushNotificationsPage pushNotificationspage;
	ExcelReader excelreader=new ExcelReader();
	@Test
	public void verifyPushNotificationPageDisplayed	()
	{
		loginPage=new LoginPage(driver);
		pushNotificationspage=new PushNotificationsPage(driver);
		loginPage.login();
		pushNotificationspage.clickOnPushNotifications();
		excelreader.setExcelFile("Notifications Data", "PushNotifications");
		String title=excelreader.getCellData(1, 0);
		String description=excelreader.getCellData(1, 1);
		pushNotificationspage.sendNotifications(title, description);
		
	}
	
}
