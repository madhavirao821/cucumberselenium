package basic;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Test Resource/basic/ApplicationUP.feature"},
		glue= {"basic"},
		dryRun =false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report.json"
		}
		
		
		)
		
  






public class RunnerApplicationUPTest {

}
