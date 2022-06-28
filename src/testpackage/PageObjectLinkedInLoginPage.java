package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectLinkedInLoginPage {

	WebDriver driver;

	public PageObjectLinkedInLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By usernametextfield =By.id("username");
	By passwordtextfield =By.id("password");

	public void enterEmail(String email) {
		driver.findElement(usernametextfield).sendKeys(email);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordtextfield).sendKeys(password);
	}
}
