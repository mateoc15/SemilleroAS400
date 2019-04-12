package com.sophos.clases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {
public void highlightElement(WebDriver driver, WebElement element) {
	if(driver instanceof JavascriptExecutor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid blue'", element);
	}
}

public void transparentHighlight(WebDriver driver, WebElement element) {
	if(driver instanceof JavascriptExecutor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid transparent'", element);
	}
}
}
