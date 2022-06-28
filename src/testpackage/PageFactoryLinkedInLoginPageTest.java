package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PageFactoryLinkedInLoginPageTest {

	@Test
	public void testPageFactoryLinkedInLoginPage() throws InterruptedException {

		System.setProperty("webdriver.edge.driver","\\E:\\Y-Software Testing\\Java Programme\\YogeshSeleniumProject\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(5000);

		PageFactoryLinkedInLoginPage obj = new PageFactoryLinkedInLoginPage(driver);

		obj.enterEmail("yogesh2492@gmail.com");

		obj.enterPassword("yogesh12345");

		driver.close();

	}
}
