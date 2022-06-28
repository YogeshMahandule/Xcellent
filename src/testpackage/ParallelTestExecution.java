package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestExecution {

	@Test
	public void testFbLogin() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);
		
		WebElement emailTextfield = driver.findElement(By.id("email"));
		
		Assert.assertTrue (emailTextfield.isDisplayed());
		
		driver.close();
}
}
