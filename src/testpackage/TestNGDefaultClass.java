package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDefaultClass {
	 @Test
	  public void f() {
		  System.out.println("In test method");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("In After method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("In before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("In After class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("In before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("In After test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("In before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("In After suite");
  }
}
