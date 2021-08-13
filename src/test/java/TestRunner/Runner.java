package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/FHIATests.feature",glue={"Steps"},plugin ={"pretty", "html:target/htmlreports"})// { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})//plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}), monochrome = true) //plugin = {"pretty", "html:target/htmlreports"}) 
	public class Runner {	

	}




