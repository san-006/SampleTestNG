package sample.testing.attributes;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class TimeOut extends Baseclass{

	@Test(timeOut=2000)
	public void searchJava() {
		browserLaunch("chrome","https://www.google.co.in/");
		findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
		pageClose();
	}
}
