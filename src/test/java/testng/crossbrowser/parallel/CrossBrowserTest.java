package testng.crossbrowser.parallel;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class CrossBrowserTest extends Baseclass{

	@Parameters("browser")
	@Test
	public void searchJava(String browser) throws InterruptedException {
		browserLaunch(browser, "https://www.google.co.in/");
		findElementByXpath("//*[@name='q']").sendKeys("TestNG",Keys.ENTER);
		Thread.sleep(30000);
		pageClose();
	}
}
