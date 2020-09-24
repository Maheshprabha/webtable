package com.atmecs.webtable.dataallocator;

import java.util.Properties;
import com.atmecs.webtable.constants.FilePaths;
import com.atmecs.webtable.utils.ReadProperties;

public class LocatorDataAllocator {
	Properties properties;
	public String scroll_img;
	public String add_product1;
	public String add_product2;
	public String checkout;
	
	public String column;
	public String row;
	public String cell_name;
	public String cell_price;
	
	public String home;
	

	public void getHomePageLocator() throws Exception {
		properties = ReadProperties.loadProperty(FilePaths.HOMEPAGE_LOCFILE);
		scroll_img = properties.getProperty("loc.scroll_img");
		add_product1 = properties.getProperty("loc.add_product1");
		add_product2 = properties.getProperty("loc.add_product2");
		checkout = properties.getProperty("loc.checkout");
		
	}
	
	public void getTableLocatorData() throws Exception {
		properties = ReadProperties.loadProperty(FilePaths.TABLE_LOCFILE);
		column = properties.getProperty("loc.table_column");
		row = properties.getProperty("loc.table_row");
		cell_name=properties.getProperty("loc.table_cell_name");
		cell_price = properties.getProperty("loc.table_cell_price");
	}
	
	
	}

