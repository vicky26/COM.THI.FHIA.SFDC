package COM.FHIA.PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"username\"]") WebElement userName;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement password;
	@FindBy(id="Login") WebElement login;	
	@FindBy(linkText="/home/home.jsp")  WebElement remindMeLater;
	@FindBy(xpath="//*[@id=\"oneHeader\"]/div[1]/div/span") WebElement sandBox;
	
	
	public LoginPage(WebDriver ldriver){
		this.driver = ldriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
	public void Login(String UN, String PWD) throws Throwable {
		userName.sendKeys(UN);   
		password.sendKeys(PWD);
		login.click();	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void verifyLogin() throws Throwable {
		
		System.out.println(sandBox.getText());
		//sandBox.sendKeys(Keys.ESCAPE);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
