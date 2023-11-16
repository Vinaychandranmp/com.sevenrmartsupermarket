package com.sevenrmartsupermarket.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class GeneralUtility {
	public String getTextOfElement(WebElement element) {
		return element.getText();
	}

	public List<String> getTextOfElements(List<WebElement> element) {
		List<String> listOfElements = new ArrayList<String>();
		for (WebElement newElement : element) {
			listOfElements.add(newElement.getText());
		}
		return listOfElements;
	}

	public boolean is_displayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean is_enabled(WebElement element) {
		return element.isEnabled();
	}

	public boolean is_selected(WebElement element) {
		return element.isSelected();
	}

	public String getElementsAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public boolean isTextPresent(WebElement element, String expectedText) {
		String data = element.getText();
		return data.contains(expectedText);
	}

	public static String getRandumFullName() {
		return null;
	
	}
}
