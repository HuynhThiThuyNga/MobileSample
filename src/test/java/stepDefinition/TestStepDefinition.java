package stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestStepDefinition {
	private static AndroidDriver driver;

	public Capabilities setCapability() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "R58M61WTDRK");
		capabilities.setCapability("udid", "R58M61WTDRK");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", ".Calculator");
		return capabilities;
	}

	@Given("init config")
	public void init_config() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), setCapability());
	}
	
	@When("add number")
	public void add_number() {
		driver.findElement(By.id("calc_keypad_btn_01")).click();
		driver.findElement(By.id("calc_keypad_btn_add")).click();
		driver.findElement(By.id("calc_keypad_btn_01")).click();
	}

	@Then("validate result")
	public void validate_result() {
		AndroidElement lbl_result = (AndroidElement) driver.findElement(By.id("calc_tv_result"));
		Assert.assertTrue(lbl_result.getText().equals("2"));
	}

}
