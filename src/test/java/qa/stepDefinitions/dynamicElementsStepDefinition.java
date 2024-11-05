package qa.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.base.Base;
import qa.pageObjects.AboutPage;

public class dynamicElementsStepDefinition extends Base {
	//Properties properties;
	AboutPage aboutPage;
	String content;
	
	@Given("On the homepage verify title {string}")
	public void on_the_homepage(String string) {
		launchBrowser("1");
		aboutPage = new AboutPage(driver);
	    assertEquals(aboutPage.get_home_page_title(),string);
	}

	@When("navigate to the About section")
	public void navigate_to_the_About_section() {
		aboutPage.navigate_to_about_section();
	}

	@When("click on {string} to reveal the hidden content")
	public void click_on_to_reveal_the_hidden_content(String string) {
		content = aboutPage.dynamic_elements_test(string);
	}

	@Then("verify that the {string} is displayed")
	public void verify_that_the_is_displayed(String string) {
	    assertEquals(string, content);
	}
	
}
