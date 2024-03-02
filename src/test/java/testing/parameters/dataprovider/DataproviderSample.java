package testing.parameters.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class DataproviderSample extends Baseclass{

	//@Test(dataProvider="credentials")->Same class
	@Test(dataProvider="sample",dataProviderClass=testing.parameters.dataprovider.DiffClass.class)
	public void loginwithDiffComboOfCredehtials(String username, String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(5000);
		driver.close();
	}
	@DataProvider(name="credentials",parallel=true)
	public Object[][] testdata() {
		return new Object[][] {{"muthu173","Test@123"},
								{"Muthu173","Testing"},	
								{"Muthu","Test@123"},
								{"Muthu","Testing"}};
	}
}
