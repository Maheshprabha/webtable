package com.atmecs.webtable.test;

import org.testng.annotations.Test;

import com.atmecs.webtable.pages.WebTableHelper;
import com.atmecs.webtable.testsuite.BaseClass;

public class WebTable extends BaseClass {
	
	@Test
	public void getTableData() throws Exception {
		WebTableHelper.getTableData(driver);
	}
}
