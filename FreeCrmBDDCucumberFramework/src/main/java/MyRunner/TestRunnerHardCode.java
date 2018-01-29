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
		dryRun = false, // then only it will run 
		strict = true // if step defination is pending it gives an exception 
		)
public class TestRunnerHardCode {
	
}
