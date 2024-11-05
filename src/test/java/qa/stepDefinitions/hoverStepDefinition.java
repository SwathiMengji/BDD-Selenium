package qa.stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.base.Base;
import qa.pageObjects.AboutPage;

public class hoverStepDefinition extends Base{
	//Properties properties;
	AboutPage aboutPage;
	String content;
	
	@When("I hover over each {string}")
	public void i_hover_over_each(String string) {
		content = aboutPage.hover_test(string);
	}

	@Then("the hidden {string} should be displayed correctly for each logo")
	public void the_hidden_should_be_displayed_correctly_for_each_logo(String string) {
		assertEquals(string, content);
	}
	
}