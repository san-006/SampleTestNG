package sample.testing.attributes;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class InvocationCountAndTimeOut extends Baseclass{

	@Test(invocationCount=3, invocationTimeOut=9000)
	public void test1() {
		browserLaunch("chrome","https://www.google.co.in/");
		findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
		pageClose();
	}
	}
