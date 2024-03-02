 package testing.parameters.dataprovider;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class ParameterSample extends Baseclass{

	@Parameters({"browser","url"})
	@BeforeMethod
	public void testSetup(String browser,String url){
		browserLaunch("chrome", "https://www.google.co.in/");
	}
	
	@Parameters("search data")
	@Test
	public void searchJava(String data) {
		
		browserLaunch("chrome", "https://www.google.co.in/");
		WebElement searchField=findElementByXpath("//*[@name='q']");
		searchField.sendKeys("data java",Keys.ENTER);
	}
}
