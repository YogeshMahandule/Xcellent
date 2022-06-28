package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	@Test
	public void testSoftAssertions() throws InterruptedException {

		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);

		WebElement signInHeading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));

		WebElement subHeading = driver.findElement(By.xpath("//p[text()='Stay updated on your professional world']"));

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(signInHeading.getText(), "Sign In",
				"Linkedin sign in heading is not displayed as per expected..");
		
		System.out.println("First assertion is passed..");
		
		softAssert.assertTrue(subHeading.isDisplayed());
		
		System.out.println("Second assertion is passed");
		
		softAssert.assertAll();
		
		driver.close();
	}
}
