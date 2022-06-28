package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLinkedInLoginPage {

	WebDriver driver;

	@FindBy(id="username")
	WebElement usernametextfield;

	@FindBy(id="password")
	WebElement passwordtextfield;

	public PageFactoryLinkedInLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		usernametextfield.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordtextfield.sendKeys(password);
	}

}
