package qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.base.Base;

public class LoginPage extends Base{
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
		
	
	By enter_email = By.id("email");
	By enter_password = By.id("password");
	By submit_button = By.id("submit");
	By heading_home = By.xpath("//h1");
	By logout_button_home = By.id("logout");
	
	public void launch_browser() {
		launchBrowser();
	}
	
	public void enter_email_password(String email, String password) {
		driver.findElement(enter_email).sendKeys(email);
		driver.findElement(enter_password).sendKeys(password);
	}
	
	public void submit_email_password() {
		driver.findElement(submit_button).click();
	}
	
	public String verify_heading() {
		waitUntilElementByLocator(logout_button_home);
		return driver.findElement(heading_home).getText();
	}
	
	public void teardown() {
		driver.quit();
	}
}
