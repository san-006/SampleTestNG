package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailureTest {

	@Test(retryAnalyzer=RetryClass.class)
	public void knowFail() {
		System.out.println("Known failue test");
		Assert.assertTrue(false);
	}
}
