package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		// Example 1
		//features ="C:\\Users\\bodduv\\git\\FreeCrmBDDCucumberFramework\\FreeCrmBDDCucumberFramework\\src\\main\\java\\Features\\login.feature",
		
		// Example 2
		features = "C:\\Users\\bodduv\\git\\FreeCrmBDDCucumberFramework\\FreeCrmBDDCucumberFramework\\src\\main\\java\\Features\\loginHardcode.feature", //the path of the feature files
		
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-output"},
		//dryRun = true,   // it will check that proper stepdefinition are true or not ie: feature and step def are equal - but will not run the file
		dryRun = false, // then only it will run 
		strict = true // if step defination is pending it gives an exception 
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)
 
public class TestRunner {
 
}	

// dryRun, Features, Glue, Tags, Monochrome, format, Strict, tags
// features - path of the feature file
// glue - path of the step defination file
// format - report file in an folder structure.
//monochrome = true - generate readable format console output .. always its true
// monochrome = false - generate non readable format text on console 
// IF you want to generat json format
// format= {"pretty","html:test-output","json:json_output/cucumber.json"} - html, json, xml to generate different formats of reports.

// Data driven we have to use "Scenario Outline " for the "Examples" key word to achive the Data driven. 
// For normat scenario we have to use "Scenario" keyword
// strict - true 