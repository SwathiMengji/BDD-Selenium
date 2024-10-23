package qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.base.Base;

public class DynamicElementsPage extends Base{
	//Using page factory  
	
	//Constructor
	public DynamicElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//Object repository
	@FindBy(xpath = "//nav[@id='site-navigation']//a[@rel='home']") WebElement homePageTitle;
	@FindBy(xpath = "//nav[@id='site-navigation']//a[contains(text(),'About')]") WebElement aboutSectionButton;
	@FindBy(xpath = "//div[@class='elementor-slide-heading'][contains(text(),'About')]") WebElement aboutSectionImageText;
	@FindBy(id = "eael-adv-accordion-98d6363") WebElement informationAccordian;
		
		
	//Methods
	public String get_home_page_title() {
		return homePageTitle.getText();
	}
			
	public void navigate_to_about_section() {
		aboutSectionButton.click();
		waitUntilElementByLocator(aboutSectionImageText);
	}
	
	public String dynamic_elements_test(String listname) {
		scrollToElement(informationAccordian);
		WebElement element = driver.findElement(By.xpath("//span[text()='"+listname+"']/ancestor::div[contains(@aria-controls,'elementor-tab-content')]"));
		String id = element.getAttribute("id");
		element.click();
		WebElement content_element = driver.findElement(By.xpath("//div[@aria-labelledby='"+id+"']//p[2]"));
		waitUntilElementByLocator(content_element);
		String content = content_element.getText();
		return content;
		
	}
		
	public void teardown() {
		driver.quit();
	}
}
