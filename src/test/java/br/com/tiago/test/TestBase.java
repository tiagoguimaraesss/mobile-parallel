package br.com.tiago.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import br.com.tiago.config.DeviceConfig;
import io.appium.java_client.AppiumDriver;

public class TestBase {
	
	protected AppiumDriver<?> driver;
	protected DeviceConfig device = new DeviceConfig();
	
	@BeforeClass
	@Parameters({"udid", "platformVersion", "systemPort", "deviceName", "appiumServerUrl"})
	public void setUp(String udid, String platformVersion, int systemPort, String deviceName, String appiumServerUrl) throws Exception {
		driver = device.androidCapabilities(udid, platformVersion, systemPort, deviceName, appiumServerUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
