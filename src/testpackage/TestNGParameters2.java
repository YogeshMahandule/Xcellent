package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters2 {
	@Test
	@Parameters ("Browser")
	
     public void testparameter(String Browser) {
		System.out.println("Browser name "+Browser);
	if (Browser.equals("chrome")){
		
	}else if (Browser.equals("firefox")) {
		
	}
	}

}
