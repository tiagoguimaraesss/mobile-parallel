package br.com.tiago.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import br.com.tiago.config.AppiumSessionConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	
	protected AndroidDriver<MobileElement> driver;
	protected AppiumSessionConfig device = new AppiumSessionConfig();
	
	@BeforeClass
	@Parameters({"deviceName", "udid", "systemPort", "appiumServerUrl"})
	public void setUp(String deviceName, String udid, int systemPort, String appiumServerUrl) throws Exception {
		driver = device.getAndroidDriverSession(deviceName, udid, systemPort, appiumServerUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
