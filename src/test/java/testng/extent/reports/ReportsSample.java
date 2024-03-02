package testng.extent.reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class ReportsSample extends Baseclass{

	@Test
	public void fbLogin2() throws InterruptedException, IOException {
		createTestName("Facebook Login");
		
		reportStatus("pass", "Browser opened");
		
		browserLaunch("chrome", "https://www.facebook.com/");
		Thread.sleep(2000);
		if(getCurrentUrl().equals("https://www.facebook.com/")) {
			reportStatus("pass", "URL Launched");
		}else {
			reportStatus("fail", "URL not launched");
		}
		findElementById("email").sendKeys("san");
		reportStatus("pass", "Username entered");
		findElementById("pass").sendKeys("san123");
		reportStatus("pass with screenshot", "Password entered");
		Thread.sleep(3000);
		pageClose();
	}
}
