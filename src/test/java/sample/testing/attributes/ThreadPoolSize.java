package sample.testing.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.Baseclass;

public class ThreadPoolSize extends Baseclass{
	@Test(invocationCount=7, threadPoolSize=3)
	public void test1() throws Exception {
		
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Java",Keys.ENTER);
		driver.close();
		
//		browserLaunch("chrome","https://www.google.co.in/");
//		findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
//		pageClose();
	}

}
 