package com.atmecs.webtable.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonHelpers {

	public static List<WebElement> findElements(WebDriver driver, String elementPath) throws Exception {
		List<WebElement> listOfElements = driver.findElements(By.xpath(elementPath));
		return listOfElements;
	}

	public static void clickElement(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

	public static void sendKeys(WebDriver driver, String elementPath, String text) {
		driver.findElement(By.xpath(elementPath)).sendKeys(text);
	}

	public static void scrollDown(WebDriver driver, String elementPath) {
		WebElement element = driver.findElement(By.xpath(elementPath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void mouseMove(WebDriver driver, String elementPath) throws Exception {
		Actions action = new Actions(driver);
		WebElement elementPlan = driver.findElement(By.xpath(elementPath));
		action.moveToElement(elementPlan).perform();
	}
}
