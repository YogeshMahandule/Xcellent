package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	@Test(dataProvider = "credentials")
	public void testDataProvider(String email, String password) {
		System.out.println("Email=>" + email + "password=>" + password);
	}

	@DataProvider(name="credentials")
	public Object[][] getdata() {
		return new Object[][] {{"yogesh@gmail.com","yogesh123"},{"mahesh@gmail.com","mahesh123"},{"ganesh@gmail.com","ganesh123"}};
	}
}
