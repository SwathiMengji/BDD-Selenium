package qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.base.Base;

public class HomePage extends Base{
	    //Constructor
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
			
		
		public void launch_browser() {
			launchBrowser();
		}
		
			
		public void teardown() {
			driver.quit();
		}
}
