package testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups={"Smoke","Regression","LoginPage"})
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(groups={"Smoke","Regression"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups={"Smoke","Regression"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups={"Sanity","Regression"})
	public void test4() {
		System.out.println("test4");
	}
	@Test(groups={"Sanity","Regression"})
	public void test5() {
		System.out.println("test5");
	}
	@Test(groups={"HomePage","Regression"})
	public void test6() {
		System.out.println("test6");
	}
	@Test(groups={"CartPage","Regression"})
	public void test7() {
		System.out.println("test7");
	}
	@Test(groups={"PDPPage","Regression"})
	public void test8() {
		System.out.println("test8");
	}
	@Test(groups={"HomePage","Regression"})
	public void test9() {
		System.out.println("test9");
	}
}
