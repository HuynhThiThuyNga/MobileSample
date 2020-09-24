package mobileTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestMobile {

	private static AndroidDriver driver;
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	 
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("deviceName", "R58M61WTDRK");
	 capabilities.setCapability("automationName", "UIAutomator2");
	 capabilities.setCapability("noReset",true);
	 capabilities.setCapability("platformVersion", "10.0");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	 capabilities.setCapability("appActivity", ".Calculator");
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 Thread.sleep(10000);
	 driver.findElement(By.id("calc_keypad_btn_01")).click();
	 driver.findElement(By.id("calc_keypad_btn_add")).click();
	 driver.findElement(By.id("calc_keypad_btn_01")).click();
	 
	 }
}
