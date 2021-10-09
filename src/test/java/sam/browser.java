package sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class browser {
	WebDriver driver;
	
	
	@Test
	public void enterData() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title =driver.getTitle();
		System.out.println("title is "+title);
		Assert.assertEquals(title, "Google");
		
	}
	
	@AfterTest
	public void clos() {
		driver.close();
	}
}
