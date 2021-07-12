package util;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import config.AppiumSessionConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestRule {
	
	protected AndroidDriver<MobileElement> driver;

	@BeforeClass
	@Parameters({"deviceName", "udid", "systemPort", "appiumServerUrl"})
	public void setUp(String deviceName, String udid, int systemPort, String appiumServerUrl) throws Exception {
		driver = new AppiumSessionConfig().getAndroidDriverSession(deviceName, udid, systemPort, appiumServerUrl);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
