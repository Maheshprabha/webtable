package com.atmecs.webtable.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.webtable.dataallocator.LocatorDataAllocator;
import com.atmecs.webtable.helper.CommonHelpers;

public class Purchase {
	static LocatorDataAllocator loc = new LocatorDataAllocator();

	public static void addProduct(WebDriver driver) throws Exception {
		loc.getHomePageLocator();
		CommonHelpers.scrollDown(driver, loc.scroll_img);

		CommonHelpers.mouseMove(driver, loc.scroll_img);
		CommonHelpers.clickElement(driver, loc.add_product1);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(loc.checkout))));
		CommonHelpers.clickElement(driver, loc.checkout);
	}
}
