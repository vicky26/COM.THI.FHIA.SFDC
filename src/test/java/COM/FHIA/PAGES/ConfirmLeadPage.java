package COM.FHIA.PAGES;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfirmLeadPage {

	
WebDriver driver;
	@FindBy(xpath="//button[contains(text(),'- Confirm Lead')]") WebElement confirmLeadButton;
	@FindBy(className="windowViewMode-normal active lafPageHost") WebElement confirmLeadDialog;
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[1]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/div/span/label") WebElement allPartiesPresent;
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[2]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/div/span/label") WebElement availablefor90Min;
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[3]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/div/span/label") WebElement confirmedOnSpot;

	
	//@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[1]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/div/span/label") WebElement allPartiesPresent;
	//@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[2]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input") WebElement availablefor90Min;
	//@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[3]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/div/span/label/span[1]") WebElement confirmedOnSpot;

	//@FindBy(name="Confirmed_Appointment_Date") List<WebElement> confirmedAppointmentDate;
	
	@FindBy(className="slds-form-element__control slds-input-has-icon slds-input-has-icon_right") WebElement confirmedAppointmentDate;
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[4]/flowruntime-flow-screen-input/flowruntime-input-wrapper2/div/lightning-input/lightning-datetimepicker/div/fieldset/div/div/div/lightning-timepicker/label") WebElement confirmedAppointmentTime;
	//@FindBy(className="slds-input slds-combobox__input") WebElement confirmedAppointmentTime;
	
	//@FindBy(name="Marital_Status") WebElement maritalStatus;
	
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[7]/flowruntime-picklist-input-lwc/div/lightning-select/label") WebElement maritalStatus;
	@FindBy(xpath="//*[@id=\"wrapper-body\"]/div[2]/div/article/div/div[2]/div/div/div[11]/flowruntime-picklist-input-lwc/div/lightning-select/label") WebElement otherContactRelation;
	@FindBy(xpath="//*[@id=\"select-3317\"]") WebElement spouse;
	//@FindBy(className="slds-button slds-button_brand") WebElement nextButtonOnConfirmLeadPopUp;
	@FindBy(className="flowruntime-input-label flowruntime-inline") List<WebElement> PopupLabel; 
	@FindBy(xpath="//*[@title=\"Next\"]") WebElement nextButtonOnConfirmLeadPopUp;
	
	@FindBy(xpath="//*[@title=\"Close this window\"]") WebElement errorMessageOnLastConfirmLeadPopUp;
	
	public ConfirmLeadPage (WebDriver ldriver){
		this.driver = ldriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
}
	//String allpartiespresent, String availableMin, String confirmedOnSpot,String confirmedAppointmentDate, String confirmedAppointmentTime

	public void newConfirmLead () throws Throwable	{
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		driver.switchTo().activeElement();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		
		//System.out.println(confirmLeadButton);
		confirmLeadButton.click();
		//Thread.sleep(10000);
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
	
	}
		public void confimrationPage(String confirmedappointmentdate, String confirmedappointmenttime, String maritalstatus, String othercontactrelation) throws Throwable {
		
		Thread.sleep(3000);
		
		//System.out.println(PopupLabel.get(0).getText());
		
		String APP=allPartiesPresent.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println("//*[@id=\""+APP+"\"]");
		WebElement app= driver.findElement(By.xpath("//*[@id=\""+APP+"\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", app);
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String AF90=availablefor90Min.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement af90=driver.findElement(By.xpath("//*[@id=\""+AF90+"\"]"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", af90);
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String COS=confirmedOnSpot.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement cos=driver.findElement(By.xpath("//*[@id=\""+COS+"\"]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", cos);
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String time1=confirmedAppointmentTime.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String tim="//*[@id=\""+time1+"\"]";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(("time xpath value is "+ tim));
		driver.findElement(By.xpath(tim)).click();
		driver.findElement(By.xpath(tim)).clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.findElement(By.xpath(tim)).sendKeys(confirmedappointmenttime,Keys.TAB);
		
		Thread.sleep(3000);
			
		String MS=maritalStatus.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String ms="//*[@id=\""+MS+"\"]";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(("time xpath value is "+ MS));
		WebElement ms=driver.findElement(By.xpath("//*[@id=\""+MS+"\"]"));
		Select MRS = new Select(ms);
		MRS.selectByVisibleText(maritalstatus);
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		String OCR=otherContactRelation.getAttribute("for");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String ms="//*[@id=\""+MS+"\"]";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(("time xpath value is "+ OCR));
		WebElement ocr=driver.findElement(By.xpath("//*[@id=\""+OCR+"\"]"));
		Select OCR1 = new Select(ocr);
		OCR1.selectByVisibleText(othercontactrelation);
		
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click();", nextButtonOnConfirmLeadPopUp);
		//nextButtonOnConfirmLeadPopUp.click();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(12000);
		
		}
		
		public void nextButtonOnSuccessPage() throws Throwable {
		
		//System.out.println(nextButtonOnLastConfirmLeadPopUp.getText());
		//Click Next button on Confirm Lead Success! pop up.
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click();", nextButtonOnConfirmLeadPopUp);
		Thread.sleep(10000);
		
		
		//System.out.println(errorMessageOnLastConfirmLeadPopUp.getText());
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click();", errorMessageOnLastConfirmLeadPopUp);
		
		//errorMessageOnLastConfirmLeadPopUp.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		
		//JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		//executor5.executeScript("arguments[0].click();", errorMessageOnLastConfirmLeadPopUp);
		
		}
		
	}
		
	
	
	
	


