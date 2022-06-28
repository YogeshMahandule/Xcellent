package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void testHardAssertions() throws InterruptedException {

		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(2000);
		
		WebElement signInHeading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		
		WebElement subHeading = driver.findElement(By.xpath("//p[text()='Stay updated on your professional world']"));
		
		// Verify heading should Sign in
		
		Assert.assertEquals(signInHeading.getText(), "Sign in");
	
		System.out.println("First assertion is passed..");
		
		
		// Verify sub heading is displayed or not
		
		Assert.assertTrue (subHeading.isDisplayed());
		
		System.out.println("second assertion is passed..");
		
		driver.close();
	}
}


