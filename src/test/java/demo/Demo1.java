package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(priority = 1, groups = {"smoke"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 1,  groups = {"smoke" , "regression"})
	public void test2() {
		System.out.println("Test 2");
		Assert.assertEquals("hi", "his");
	}
	
	@Test(priority=8 ,  groups = {"smoke" , "regression"})
	public void test3() {
		System.out.println("Test 3");

		int i = 10;
		int j =20;
		System.out.println(i+j);

	}

}
