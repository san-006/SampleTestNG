package sample.testing.attributes;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=5)
	public void tests() {
		System.out.println("test 5");
	}
	@Test
	public void testk() {
		System.out.println("test 6");
	}
	@Test(priority=5)
	public void testi() {
		System.out.println("test 7");
	}
	@Test(priority=-1)
	public void testsz() {
		System.out.println("test 8");
	}
	@Test(priority=-3)
	public void testsb() {
		System.out.println("test 9");
	}
	@Test(priority=4)
	public void testsr() {
		System.out.println("test 4");
	}

	@Test(priority=2)
	public void testsa() {
		System.out.println("test 2");
	}

	@Test(priority=1)
	public void testsf() {
		System.out.println("test 1");
	}

	@Test(priority=3)
	public void testsy() {
		System.out.println("test 3");
	}
}
