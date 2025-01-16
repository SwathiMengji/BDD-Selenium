package qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.base.Base;

public class AboutPage extends Base{
	//Using page factory  
	
	//Constructor
	public AboutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//Object repository
	@FindBy(xpath = "//nav[@id='site-navigation']//a[@rel='home']") WebElement homePageTitle;
	@FindBy(xpath = "//nav[@id='site-navigation']//a[contains(text(),'About')]") WebElement aboutSectionButton;
	@FindBy(xpath = "//div[@class='elementor-slide-heading'][contains(text(),'About')]") WebElement aboutSectionImageText;
	@FindBy(id = "eael-adv-accordion-98d6363") WebElement informationAccordian;
	@FindBy(xpath = "//section[@data-id='29aa05e']") WebElement logoAccordian;
	@FindBy(xpath = "//div[@class='tippy-popper']") WebElement hoverLogo;
	@FindBy(xpath = "//div[@class='tippy-content']") WebElement hoverContent;
		
		
	//Methods
	public String get_home_page_title() {
		return homePageTitle.getText();
	}
			
	public void navigate_to_about_section() {
		aboutSectionButton.click();
		waitUntilElementByWebElement(aboutSectionImageText);
	}
	
	public String dynamic_elements_test(String listname) {
		scrollToElement(informationAccordian);
		WebElement element = driver.findElement(By.xpath("//span[text()='"+listname+"']/ancestor::div[contains(@aria-controls,'elementor-tab-content')]"));
		String id = element.getAttribute("id");
		element.click();
		WebElement content_element = driver.findElement(By.xpath("//div[@aria-labelledby='"+id+"']//p[2]"));
		waitUntilElementByWebElement(content_element);
		String content = content_element.getText();
		return content;	
	}
	
	public String hover_test(String listnum) {
		scrollToElement(informationAccordian);
		Actions actions = new Actions(driver);
        WebElement logoElement = driver.findElement(By.xpath("(//img)["+listnum+"]"));
        actions.moveToElement(logoElement).perform();
        waitUntilElementByWebElement(hoverContent);
		return hoverContent.getText();
	}
}
