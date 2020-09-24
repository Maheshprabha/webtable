package com.atmecs.webtable.testsuite;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import com.atmecs.webtable.constants.FilePaths;
import com.atmecs.webtable.utils.ReadProperties;

public class BaseClass {
	public static WebDriver driver;
	Properties properties;

	@BeforeTest
	public void invokeBrowser() throws Exception {
		properties = ReadProperties.loadProperty(FilePaths.CONFIG_FILE);
		System.setProperty("webdriver.chrome.driver", FilePaths.CHROME_FILE);
		driver = new ChromeDriver();
		driver.get(properties.getProperty("Url"));
		driver.manage().window().maximize();
	}
}
