package COM.FHIA.PAGES;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewLeadInfoPage  {

WebDriver driver;
Library library= new Library(driver);	
	@FindBy(className="slds-button slds-icon-waffle_container slds-context-bar__button slds-button forceHeaderButton salesforceIdentityAppLauncherHeader") WebElement FHIAMenu;
	@FindBy(xpath="//data-label=\"FHIA Call Center\"") WebElement FHIACallCenter;
	@FindBy(className="navMenu oneAppNavMenu slds-context-bar__item--divider-right navexAppNavMenu") WebElement ObjectDropDownIcon;
	@FindBy(linkText="\"/lightning/o/Lead/home\"") WebElement LeadObject;
	@FindBy(xpath="//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div") WebElement newButton;
	@FindBy(xpath="//*[@placeholder='First Name']") WebElement firstName;
	@FindBy(xpath="//*[@placeholder='Last Name']") WebElement lastName;
	@FindBy(className="slds-modal__title slds-hyphenate slds-text-heading--medium") WebElement leadTab;
	@FindBy(xpath="//*[@placeholder='Search Source...']") WebElement sourceName;
	@FindBy(xpath="//*[@id=\"input-575-1-575\"]/span[2]/span[1]/lightning-base-combobox-formatted-text|//*[@id=\"input-571-1-571\"]/span[2]/span[1]") WebElement account;
	@FindBy(xpath="//label[contains(text(),'Company')]") WebElement companyName;
	@FindBy(xpath="//label[contains(text(),'Primary Project Type')]") WebElement primaryProjectType; 
	@FindBy(xpath="//label[contains(text(),'Preferred Language')]") WebElement preferredLanguage;
	@FindBy(xpath="//*[@data-value='Spanish']") WebElement spanish;
	@FindBy(xpath="//*[@placeholder='Search Address']") WebElement addressField;
	@FindBy(xpath="//label[contains(text(),'Appointment Requested?')]") WebElement appointedRequested;
	@FindBy(xpath="//*[@data-value='Yes']") WebElement yes;
	@FindBy(xpath="//label[contains(text(),'Date')]") List<WebElement> appointementSetDate;
	@FindBy(xpath="//label[contains(text(),'Time')]") List<WebElement> appointementSetTime;
	@FindBy(xpath="//*[@id=\"input-333-0-333\"]/span[2]/span") WebElement time;
	@FindBy(name="SaveEdit") WebElement saveButton;
	@FindBy(xpath="//*[@apiname='SaveEdit']") WebElement save;
	@FindBy(xpath="//*[@data-tab-name='New']") WebElement New;
	//@FindBy(className="slds-button slds-button--brand slds-path__mark-complete stepAction active uiButton") WebElement markStatusAsCurrent;
	@FindBy(xpath="//span[contains(text(),'Mark as Current Status')]") WebElement markStatusAsCurrent;
	
	
	public NewLeadInfoPage(WebDriver ldriver){
		this.driver = ldriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
}
	
	public void FHIAmenu() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",FHIAMenu);
		FHIAMenu.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		FHIACallCenter.click();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		ObjectDropDownIcon.click();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		LeadObject.click();
		
	}
	
	public void NewLead() 
	{
		
		newButton.click();	
		}
	
	public void NewLeadInsert(String firstname, String lastname,String sourcename, String companyname, String primaryprojecttype, String preferredLanguage1, String addressfield, String appointmentrequested, String appointmentsetdate, String appointementsettime) throws Throwable 
	{  
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	System.out.println("Title "+driver.getTitle());
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	String source1=sourceName.getAttribute("id")+"-1";
	sourceName.sendKeys(sourcename);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String Sou = "//*[@data-item-id='"+source1+"']";
	System.out.println(Sou);
	driver.findElement(By.xpath(Sou)).click();
	
	
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	firstName.sendKeys(firstname + library.todaysDateTime());
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	lastName.sendKeys(lastname + library.todaysDateTime());
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	
	String CN1=companyName.getAttribute("for");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='"+CN1+"']")).sendKeys(companyname);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	String PPT=primaryProjectType.getAttribute("for");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement primaryProjectType1 = driver.findElement(By.xpath("//*[@id='"+PPT+"']"));
	primaryProjectType1.click();
	String PPT1=primaryProjectType1.getAttribute("id")+"-1";
	primaryProjectType1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String z = "//*[@data-item-id='"+PPT1+"']";
	driver.findElement(By.xpath(z)).click();
	

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
	String text1=preferredLanguage.getAttribute("for");
	System.out.println("preferred Language is " + text1);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='"+text1+"']")).sendKeys(Keys.ENTER);
	spanish.click();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	String text2=addressField.getAttribute("id")+"-0";
	addressField.sendKeys(addressfield);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String y = "//*[@data-item-id='"+text2+"']";
	driver.findElement(By.xpath(y)).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	String aptRqt=appointedRequested.getAttribute("for");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String ap="//*[@id=\""+aptRqt+"\"]";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Appointment Request" + ap);
	driver.findElement(By.xpath(ap)).sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	yes.click();
	
	String date1=appointementSetDate.get(0).getAttribute("for");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String dat="//*[@id=\""+date1+"\"]";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("date xpath value is "+dat);
	driver.findElement(By.xpath(dat)).sendKeys(appointmentsetdate);
	

	Thread.sleep(1000);
	String time1=appointementSetTime.get(0).getAttribute("for");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String tim="//*[@id=\""+time1+"\"]";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println(("time xpath value is "+ tim));
	driver.findElement(By.xpath(tim)).click();
	driver.findElement(By.xpath(tim)).clear();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	driver.findElement(By.xpath(tim)).sendKeys(appointementsettime,Keys.TAB);
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	save.click();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	New.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	
	WebElement element = markStatusAsCurrent;
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);

	
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	/*String markStatusAscompleteafterclick1 = null;
	markStatusAsCompleteafterclick.getAttribute(markStatusAscompleteafterclick1);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	*/
	
	
	}
}
	
	
