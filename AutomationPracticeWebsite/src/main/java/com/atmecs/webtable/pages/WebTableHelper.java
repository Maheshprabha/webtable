package com.atmecs.webtable.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.webtable.dataallocator.LocatorDataAllocator;
import com.atmecs.webtable.helper.CommonHelpers;

public class WebTableHelper {
	
	static LocatorDataAllocator loc = new LocatorDataAllocator();

	public static void getTableData(WebDriver driver) throws Exception {
		loc.getTableLocatorData();
		int row_count = CommonHelpers.findElements(driver, loc.row).size();
		System.out.println("Total Rows: " + row_count);
		int column_count = CommonHelpers.findElements(driver, loc.column).size();
		System.out.println("Total  Columns: " + column_count);
		
		//System.out.println("product name: "+driver.findElement(By.xpath(loc.cell_name)).getText());
		System.out.println("product price: "+driver.findElement(By.xpath(loc.cell_price)).getText());
		
		
	}
	
}
