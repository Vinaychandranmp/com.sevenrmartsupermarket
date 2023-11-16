package com.sevenrmartsupermarket.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;
import com.sevenrmartsupermarket.utilities.WaitUtility;

public class AdminUsersPage {
	WebDriver driver;
	PageUtility pageUtility=new PageUtility();
	GeneralUtility generalUtility=new GeneralUtility();
	WaitUtility waitUtility;
	
	@FindBy(xpath="//a[@class=' nav-link']//p[contains(text(),'Admin Users')]")
	WebElement adminUserMenu;
	@FindBy(xpath="//a[contains(text(),'New')]")
	WebElement newButton;
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	WebElement passWord;
	@FindBy(xpath="//select[@id='user_type']")
	WebElement userType;
	@FindBy(xpath="//button[@name='Create']")
	WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible' and contains(., 'User Created Successfully')]")
	WebElement successMessage;
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnAdminUsers()
	{
		adminUserMenu.click();
	}
	public void clickOnNewButton()
	{
		newButton.click();
	}
	public void enterUserName(String username)
	{
		userName.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		passWord.sendKeys(password);
	}
	
	public void selectUserType(String usertype)
	{
		pageUtility.select_ByVisibleText(userType, usertype);
		/*Select select=new Select(userType);
		select.selectByVisibleText(usertype);	*/
		
	}
	public void saveAdminUser()
	{
		waitUtility=new WaitUtility(driver);
		waitUtility.waitForElementTobeClickable(saveButton, 10l);
		saveButton.click();
	}
	public void successMessage()
	{
		generalUtility.is_displayed(successMessage);
	}
	public void createAdminUsers(String username,String password,String usertype)
	{
		clickOnAdminUsers();
		clickOnNewButton();
		enterUserName(username);
		enterPassword(password);
		selectUserType(usertype);
		saveAdminUser();
		successMessage();
	}
	

}
