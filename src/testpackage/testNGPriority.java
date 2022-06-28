package testpackage;

import org.testng.annotations.Test;

public class testNGPriority {

	@Test(priority=1)
	public void test1() {
		System.out.println("In test1 method");
	}
	@Test                                          //run 1st as default priority is 0.
	public void test2() {
		System.out.println("In test2 method");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("In test3 method");
	}
}