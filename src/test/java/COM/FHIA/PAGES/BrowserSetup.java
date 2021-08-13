package COM.FHIA.PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public WebDriver launchBrowser(WebDriver driver) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String baseURL = "https://titanhome--partialuat.my.salesforce.com";
		//String baseURL = "https://Test/admin/login";
		driver.get(baseURL);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		
		return driver;
		
	}

}
