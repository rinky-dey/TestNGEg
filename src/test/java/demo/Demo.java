package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeClass
	private void befor_class() {
		System.out.println("Before Class");

	}
	
	
	@BeforeMethod
	public void before_method_test() {
		System.out.println("Before Method test");

	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups = {"smoke"})
	public void test3() {
		System.out.println("Test 3");
		int i = 10;
		System.out.println(i);
	}
	
	@AfterMethod
	private void adfter() {
		System.out.println("After Menthod Test");

	}
	
	
	
	@AfterClass
	private void after_class() {
		System.out.println("After Class");

	}
	
	
}
