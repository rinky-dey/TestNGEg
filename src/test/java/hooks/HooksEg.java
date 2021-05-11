package hooks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class HooksEg {

	@BeforeSuite
	private void before_suit() {
		System.out.println("Before Suit");

	}
	@BeforeTest
	private void before_test() {
		System.out.println("Before Test");

	}
	@AfterTest
	private void after_test() {
		System.out.println("After test");
	}
	@AfterSuite
	private void after_suit() {
		System.out.println("After Suit");

	}
}
