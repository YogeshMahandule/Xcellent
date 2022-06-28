package testpackage;

import org.testng.annotations.Test;

public class TestNGDependencyTest2 {

	@Test (dependsOnGroups="Smoke1")
	//@Test (dependsOnMethods= {"test2","test3"})
	public void test1() {
		System.out.println("In test1 method");
	}
	
	@Test(groups="Smoke1")  
	//@Test
	public void test2() {
		System.out.println("In test2 method");
	}
	
	//@Test
	@Test
	public void test3() {
		System.out.println("In test3 method");
	}
}