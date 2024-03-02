package sample.testing.attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleAnnotation {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}

//	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@AfterMethod

	public void AfterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
}
