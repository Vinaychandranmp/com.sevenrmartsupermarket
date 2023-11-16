package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class PushNotificationsPage 
{
	WebDriver driver;
	GeneralUtility generalUtility=new GeneralUtility();
	
	@FindBy(xpath="//p[contains(text(),'Push Notifications')]")
	WebElement pushNotificationMenu;
	@FindBy(xpath="//input[@id='title']")
	WebElement titleField;
	@FindBy(xpath="//input[@id='description']")
	WebElement descriptionField;
	@FindBy(xpath="//button[@name='create']")
	WebElement sendButton;
	@FindBy(xpath="//a[contains(text(),'Reset')]")
	WebElement resetButton;
	@FindBy(xpath="//div[contains(@class,'alert alert-success')]")
	WebElement successMessage;
	public PushNotificationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnPushNotifications()
	{
		pushNotificationMenu.click();
	}
	public void enterTitle(String text)
	{
		titleField.sendKeys(text);
	}
	public void enterDescription(String description)
	{
		descriptionField.sendKeys(description);
	}
	public void clickOnSendButton()
	{
		sendButton.click();
	}
	public void successMessage()
	{
		generalUtility.is_displayed(successMessage);
	}
	public void sendNotifications(String title,String description)
	{
		enterTitle(title);
		enterDescription(description);
		clickOnSendButton();
		successMessage();
	}
	
}
