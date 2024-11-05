package qa.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.base.Base;
import qa.pageObjects.AboutPage;
import qa.pageObjects.LoginPage;

public class LoginStepDefinition extends Base{
    
	LoginPage loginPage;
	AboutPage homePage;
	Properties properties;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage(driver);
		//loginPage.launch_browser();
		loginPage.launchBrowser("1");
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_email_and_password(String email, String password) {
		loginPage.enter_email_password(email, password);
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
		loginPage.submit_email_password();
	}

	@Then("user is navigated to home page and verify heading {string}")
	public void user_is_navigated_to_home_page_and_verify_heading(String heading) {
		assertEquals(loginPage.verify_heading(), heading);
	}

	@And("close the browser")
	public void close_the_browser() {
		loginPage.teardown();
	}

}
