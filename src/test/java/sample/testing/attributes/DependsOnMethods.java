package sample.testing.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void addToCart() {
		System.out.println("Product added into the Cart");
	}
	@Test(dependsOnMethods = "sample.testing.attributes.Enabled.sample1")
	public void login() {
		System.out.println("User logged in");
	//	Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void checkout() {
		System.out.println("Checkout the Product");
	}
}
