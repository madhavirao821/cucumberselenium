package Getwithdatatable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Test Resource/GetValidateValueswithDatatable/GetwithDatatable.feature"},
		glue= {"Getwithdatatable"},
		dryRun =false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json"
		}
		
		
		)
		





public class RunnerGetwithDatatableTest {

}
