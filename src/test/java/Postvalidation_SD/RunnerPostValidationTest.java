package Postvalidation_SD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Test Resource/PostvalidationFF/ValidatePostRequest.feature"},
		glue= {"Postvalidation_SD"},
		//dryRun =false,
		//monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json"
		}
		
		
		)
		




public class RunnerPostValidationTest {

}
