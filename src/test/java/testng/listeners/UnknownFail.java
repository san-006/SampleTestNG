package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFail {

	
	@Test
	public void unKnownFail() {
		System.out.println("Unknownfailure Test");
		Assert.assertTrue(false);
	}
}
