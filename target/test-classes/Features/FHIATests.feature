#Author: Vikram Raj
#Date : 07/30/2021

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
   Given Launch Salesforce URL
   When Login using "<UN>" & "<PWD>" and click on Login button
   And verify user should be logged in
   When Click on new Lead form and Enter "<FirstName>","<LastName>","<Source>","<Company>","<PrimaryProjectType>","<PreferredLanguage>","<Address>","<AppointmentRequested?>","<AppointmentSetDate>" and "<AppointmentSetTime>" and  click Save
   When user clicks on Confirm Lead button and enters information "<confirmedappointmentdate>","<confirmedappointmenttime>","<maritalstatus>" and "<othercontactrelation>" and click on Next button
   And click on Next button on Confirm Lead pop up window
   Then Lead should be confirmed successfully
   
   Examples:
   |UN|PWD|FirstName|LastName|Source|Company|PrimaryProjectType|PreferredLanguage|Address|AppointmentRequested?|AppointmentSetDate|AppointmentSetTime|confirmedappointmentdate|confirmedappointmenttime|maritalstatus|othercontactrelation|
   |vraj@titanhomeimprovement.com.partialuat|Password@1|Auto1|Moto1|ACS|Company_Auto2|Windows/Doors|Spanish|8 Alhambra Plaza|Yes|10/9/2021|7:00 AM|11/9/2021|10:00 AM|Married|Spouse|
   
   
    
   
  


  
   