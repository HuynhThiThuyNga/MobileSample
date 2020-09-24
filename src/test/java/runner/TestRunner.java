package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/site/pretty/report.html", "html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
		glue = { "stepDefinition" }, 
		features = {"src/test/resources/features" }, tags= {"@test"})
public class TestRunner {
	
}

