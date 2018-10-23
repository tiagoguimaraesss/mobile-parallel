package br.com.tiago.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import br.com.tiago.config.DeviceConfig;
import io.appium.java_client.AppiumDriver;

public class BaseTest {
	
	protected AppiumDriver<?> driver;
	protected DeviceConfig device = new DeviceConfig();
	
	@BeforeClass
	@Parameters({"udid", "platformVersion", "systemPort", "deviceName"})
	public void setUp(String udid, String platformVersion, int systemPort, String deviceName) throws Exception {
		driver = device.androidCapabilities(udid, platformVersion, systemPort, deviceName);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
