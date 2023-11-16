package com.sevenrmartsupermarket.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	JavascriptExecutor js;
	
	public PageUtility() {
		this.driver=driver;
		js=(JavascriptExecutor)driver;
	}
	public void select_ByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void select_ByVisibleText(WebElement element,String elements)
	{
		Select select=new Select(element);
		select.selectByVisibleText(elements);
	}
	public void select_ByValue(WebElement element,String value) 
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void jsClick(WebElement element)
	{
		js.executeScript("arguments[0].click();", element);
	}
	public void jsScrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void elementRightCLick(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	

}
