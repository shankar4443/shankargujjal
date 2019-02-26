package QSpisers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void testA(){
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
