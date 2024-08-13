package com.qa.photofin.stepdef;

import org.openqa.selenium.WebDriver;

import com.qa.photofin.base.WebdriverManager;
import com.qa.photofin.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	
	private WebDriver driver;

	@Before
	public void setUp() {
		PropertyReader reader=new PropertyReader("user.properties");
		String browser = reader.getProperty("browsertype");
		System.out.println(browser);

				driver = WebdriverManager.getInstance(browser).getDriver();
				driver.get("https://staging.photonfin.com/#/");

	}
	
	
	
	@After
	public void tearDown() {
		WebdriverManager.quitBrowser();
	}
}
