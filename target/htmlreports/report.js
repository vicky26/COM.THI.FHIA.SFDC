$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/FHIATests.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Vikram Raj"
    },
    {
      "line": 2,
      "value": "#Date : 07/30/2021"
    }
  ],
  "line": 5,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Launch Salesforce URL",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Login using \"\u003cUN\u003e\" \u0026 \"\u003cPWD\u003e\" and click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verify user should be logged in",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on new Lead form and Enter \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cSource\u003e\",\"\u003cCompany\u003e\",\"\u003cPrimaryProjectType\u003e\",\"\u003cPreferredLanguage\u003e\",\"\u003cAddress\u003e\",\"\u003cAppointmentRequested?\u003e\",\"\u003cAppointmentSetDate\u003e\" and \"\u003cAppointmentSetTime\u003e\" and  click Save",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Confirm Lead button and enters information \"\u003cconfirmedappointmentdate\u003e\",\"\u003cconfirmedappointmenttime\u003e\",\"\u003cmaritalstatus\u003e\" and \"\u003cothercontactrelation\u003e\" and click on Next button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on Next button on Confirm Lead pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Lead should be confirmed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "UN",
        "PWD",
        "FirstName",
        "LastName",
        "Source",
        "Company",
        "PrimaryProjectType",
        "PreferredLanguage",
        "Address",
        "AppointmentRequested?",
        "AppointmentSetDate",
        "AppointmentSetTime",
        "confirmedappointmentdate",
        "confirmedappointmenttime",
        "maritalstatus",
        "othercontactrelation"
      ],
      "line": 19,
      "id": "title-of-your-feature;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "vraj@titanhomeimprovement.com.partialuat",
        "Password@1",
        "Auto1",
        "Moto1",
        "ACS",
        "Company_Auto2",
        "Windows/Doors",
        "Spanish",
        "8 Alhambra Plaza",
        "Yes",
        "10/9/2021",
        "7:00 AM",
        "11/9/2021",
        "10:00 AM",
        "Married",
        "Spouse"
      ],
      "line": 20,
      "id": "title-of-your-feature;title-of-your-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag"
    },
    {
      "line": 8,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Launch Salesforce URL",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Login using \"vraj@titanhomeimprovement.com.partialuat\" \u0026 \"Password@1\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verify user should be logged in",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on new Lead form and Enter \"Auto1\",\"Moto1\",\"ACS\",\"Company_Auto2\",\"Windows/Doors\",\"Spanish\",\"8 Alhambra Plaza\",\"Yes\",\"10/9/2021\" and \"7:00 AM\" and  click Save",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Confirm Lead button and enters information \"11/9/2021\",\"10:00 AM\",\"Married\" and \"Spouse\" and click on Next button",
  "matchedColumns": [
    12,
    13,
    14,
    15
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on Next button on Confirm Lead pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Lead should be confirmed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.launch_Salesforce_URL()"
});
formatter.result({
  "duration": 10745951100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vraj@titanhomeimprovement.com.partialuat",
      "offset": 13
    },
    {
      "val": "Password@1",
      "offset": 58
    }
  ],
  "location": "Step.login_using(String,String)"
});
formatter.result({
  "duration": 4880446400,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_should_be_logged_in()"
});
formatter.result({
  "duration": 3161213400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Auto1",
      "offset": 34
    },
    {
      "val": "Moto1",
      "offset": 42
    },
    {
      "val": "ACS",
      "offset": 50
    },
    {
      "val": "Company_Auto2",
      "offset": 56
    },
    {
      "val": "Windows/Doors",
      "offset": 72
    },
    {
      "val": "Spanish",
      "offset": 88
    },
    {
      "val": "8 Alhambra Plaza",
      "offset": 98
    },
    {
      "val": "Yes",
      "offset": 117
    },
    {
      "val": "10/9/2021",
      "offset": 123
    },
    {
      "val": "7:00 AM",
      "offset": 139
    }
  ],
  "location": "Step.click_on_new_Lead_form_and_Enter_and_click_Save(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 23944908100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11/9/2021",
      "offset": 59
    },
    {
      "val": "10:00 AM",
      "offset": 71
    },
    {
      "val": "Married",
      "offset": 82
    },
    {
      "val": "Spouse",
      "offset": 96
    }
  ],
  "location": "Step.user_clicks_on_Confirm_Lead_button_and_enters_information_and_and_click_on_Next_button(String,String,String,String)"
});
formatter.result({
  "duration": 38226120900,
  "status": "passed"
});
formatter.match({
  "location": "Step.click_on_Next_button_on_Confirm_Lead_pop_up_window()"
});
formatter.result({
  "duration": 13171515300,
  "status": "passed"
});
formatter.match({
  "location": "Step.lead_should_be_confirmed_successfully()"
});
formatter.result({
  "duration": 51800,
  "status": "passed"
});
});