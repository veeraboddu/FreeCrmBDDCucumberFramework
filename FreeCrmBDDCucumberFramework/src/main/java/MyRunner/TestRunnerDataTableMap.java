package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		// Example 1
		//features ="C:\\Users\\bodduv\\git\\FreeCrmBDDCucumberFramework\\FreeCrmBDDCucumberFramework\\src\\main\\java\\Features\\login.feature",
		// Example 2
		features = "C:\\Users\\bodduv\\git\\FreeCrmBDDCucumberFramework\\FreeCrmBDDCucumberFramework\\src\\main\\java\\Features\\DealDataTableMaps.feature", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		// format is used to generate different types of reports like html, json and xml reports
		
		monochrome = true, // display the console output proper readable format.
		dryRun = false, // then only it will run 
		strict = true // if step definition is pending it gives an exception 
		)
public class TestRunnerDataTableMap {

}
