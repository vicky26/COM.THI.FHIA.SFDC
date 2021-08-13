package COM.FHIA.PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	WebDriver driver;
	
	@FindBy(className="slds-icon-waffle") WebElement menuButton;
	
	
	
	
	public MenuPage(WebDriver ldriver){
		this.driver = ldriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
        
        
    }
	public void Login(String UN, String PWD) {
		menuButton.click(); 
		menuButton.sendKeys("FHIA Call Center");

	}

}
