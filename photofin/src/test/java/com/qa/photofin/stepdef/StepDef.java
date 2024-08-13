package com.qa.photofin.stepdef;

import org.openqa.selenium.WebDriver;

import com.qa.photofin.base.WebdriverManager;
import com.qa.photofin.pageobj.HomePage;
import com.qa.photofin.utils.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	private WebDriver driver;
	private HomePage hp;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		PropertyReader reader = new PropertyReader("user.properties");
		String browser = reader.getProperty("browsertype");
		System.out.println(browser);

		driver = WebdriverManager.getInstance(browser).getDriver();
		hp = new HomePage(driver);
	}

	@When("user click on getstarted")
	public void user_click_on_getstarted() {
		hp.clickOngetStarted();
	}

	@Then("user should able to view the To begin, please answer some questions for me")
	public void user_should_able_to_view_the_to_begin_please_answer_some_questions_for_me() {

	}
}
