package sample.testing.attributes;

import org.testng.annotations.Test;

public class Enabled {

	@Test
	public void sample1() {
		System.out.println("Test 1");
		
	}
	@Test(enabled=false)
	public void sample2() {
		System.out.println("Test 2");
		
	}
	
}
