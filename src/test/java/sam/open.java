package sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class open {
	
	WebDriver driver;
	
	
	
	@Test
	public void openFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
