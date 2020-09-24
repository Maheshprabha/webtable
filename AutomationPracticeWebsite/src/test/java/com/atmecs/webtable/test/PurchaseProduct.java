package com.atmecs.webtable.test;

import org.testng.annotations.Test;

import com.atmecs.webtable.pages.Purchase;
import com.atmecs.webtable.testsuite.BaseClass;

public class PurchaseProduct extends BaseClass {
	
	@Test
	public void addToCart() throws Exception {
		Purchase.addProduct(driver);
	}
}
