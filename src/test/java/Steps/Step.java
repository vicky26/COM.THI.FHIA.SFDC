package Steps;

import org.openqa.selenium.WebDriver;

import COM.FHIA.PAGES.BrowserSetup;
import COM.FHIA.PAGES.ConfirmLeadPage;
import COM.FHIA.PAGES.LoginPage;
import COM.FHIA.PAGES.NewLeadInfoPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	public static WebDriver driver;
	 
	
	
	@Given("^Launch Salesforce URL$")
	public void launch_Salesforce_URL() throws Throwable {
		
	    BrowserSetup base=new BrowserSetup();
	    driver = base.launchBrowser(driver);
	    
	}

	@When("^Login using \"([^\"]*)\" & \"([^\"]*)\" and click on Login button$")
	public void login_using(String UN, String PWD) throws Throwable {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.Login(UN, PWD);
		
	}

@And("^verify user should be logged in$")
public void user_should_be_logged_in() throws Throwable {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.verifyLogin();
    
}




@When("^Click on new Lead form and Enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" and  click Save$")
public void click_on_new_Lead_form_and_Enter_and_click_Save(String firstname, String lastname,String Source, String companyname, String primaryprojecttype, String preferredlanguage, String addressfield, String appointmentrequested, String appointmentsetdate, String appointementsettime) throws Throwable {
	NewLeadInfoPage newLeadForm=new NewLeadInfoPage(driver); 
	//newLeadForm.FHIAmenu();
	newLeadForm.NewLead();
	newLeadForm.NewLeadInsert(firstname, lastname, Source, companyname, primaryprojecttype, primaryprojecttype, addressfield, appointmentrequested, appointmentsetdate, appointementsettime);
	
}

@When("^user clicks on Confirm Lead button and enters information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" and click on Next button$")
public void user_clicks_on_Confirm_Lead_button_and_enters_information_and_and_click_on_Next_button(String confirmedappointmentdate, String confirmedappointmenttime, String maritalstatus, String othercontactrelation) throws Throwable {
	ConfirmLeadPage confirmleadpage = new ConfirmLeadPage(driver); 
	confirmleadpage.newConfirmLead();
	confirmleadpage.confimrationPage(confirmedappointmentdate, confirmedappointmenttime, maritalstatus, othercontactrelation);
}


@And("^click on Next button on Confirm Lead pop up window$")
public void click_on_Next_button_on_Confirm_Lead_pop_up_window() throws Throwable {
	ConfirmLeadPage confirmleadpage = new ConfirmLeadPage(driver); 
		confirmleadpage.nextButtonOnSuccessPage();
	
}

@Then("^Lead should be confirmed successfully$")
public void lead_should_be_confirmed_successfully() throws Throwable {
  
}



}
