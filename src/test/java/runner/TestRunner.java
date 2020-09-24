package runner;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},
		glue = { "stepDefinition" }, 
		features = {"src/test/resources/features" })
public class TestRunner {

}

@Before
public void setCapabilities() {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("deviceName", "R58M61WTDRK");
	 capabilities.setCapability("automationName", "UIAutomator2");
	 capabilities.setCapability("noReset",true);
	 capabilities.setCapability("platformVersion", "10.0");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	 capabilities.setCapability("appActivity", ".Calculator");
}
