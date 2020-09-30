package com.atmecs.webtable.testsuite;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.atmecs.webtable.constants.FilePaths;
import com.atmecs.webtable.utils.ReadProperties;

public class BaseClass {
	public static WebDriver driver;
	Properties properties;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		properties = ReadProperties.loadProperty(FilePaths.CONFIG_FILE);
		if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver
			System.setProperty("webdriver.chrome.driver",FilePaths.CHROME_FILE);
			//create chrome instance
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
				//set path to firefox
					System.setProperty("webdriver.gecko.driver", FilePaths.FIREFOX_FILE);
					//create firefox instance
					driver = new FirefoxDriver();
				}
		
	    else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
	
	

