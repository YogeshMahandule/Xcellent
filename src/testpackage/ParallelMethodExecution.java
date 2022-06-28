package testpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelMethodExecution {

	@Test
	public void testLinkedinLoginPage() throws InterruptedException {


		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);
		
		WebElement signInHeading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		
		WebElement subHeading = driver.findElement(By.xpath("//p[text()='Stay updated on your professional world']"));
		
		// Verify heading should Sign in
		
		assertEquals(signInHeading.getText(), "Sign in");
		
		System.out.println("First assertion is passed..");
		
		
		// Verify sub heading is displayed or not
		
		assertTrue(subHeading.isDisplayed());
		
		System.out.println("second assertion is passed..");
		
		driver.close();
	}
	
	@Test
	public void testGoogle() throws InterruptedException {
		

		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();


		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);
		
		WebElement googleSearchTextfield = driver.findElement(By.xpath("//input[@name='q']"));
		
		assertTrue(googleSearchTextfield.isDisplayed());
		
		driver.close();
		
	}
}
