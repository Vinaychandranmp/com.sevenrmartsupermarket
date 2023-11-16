package com.sevenrmartsupermarket.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.constants.Constants;

public class LoginPage {
	WebDriver driver;
	Properties properties = new Properties();
	FileInputStream ip;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;// Encapsulation - Only call by using member method
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInButton;
	//@FindBy(xpath="")

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		try {
			ip = new FileInputStream(Constants.CONFIG_FILE_PATH);
			properties.load(ip);// For reading the file path mentioned
		} catch (Exception e) {
			e.printStackTrace();// To print the exception in console
			System.out.println("File not found");
		}

	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnSignInButton() {
		signInButton.click();
	}

	public void login() {
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		enterUserName(username);
		enterPassword(password);
		clickOnSignInButton();

	}

	public void login(String username, String password) //Method overloading
	{
		enterUserName(username);
		enterPassword(password);
		clickOnSignInButton();
	}
	public void getInvalidLoginErrorMessage()
	{
		
	}

}
