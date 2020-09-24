package com.atmecs.webtable.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static Properties properties;

	public static Properties loadProperty(String filePath) throws IOException {
		properties = new Properties();
		properties.load(new FileInputStream(filePath));
		return properties;
	}
}
