package basic;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Test Resource/basic/HRMS basicTestScenarios.feature"},
		glue= {"basic"},
		dryRun =false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json"
		}
		
		
		)
		
  







public class RunnerBAsicHRMSTest {

}
