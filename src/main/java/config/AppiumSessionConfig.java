package config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSessionConfig {

    public AndroidDriver<MobileElement> getAndroidDriverSession(String deviceName, String udid, int systemPort, String appiumServerUrl) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
    	capabilities.setCapability(MobileCapabilityType.UDID, udid);
        capabilities.setCapability("systemPort", systemPort);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    	capabilities.setCapability(MobileCapabilityType.APP, new File("app/app-debug.apk").getAbsolutePath());

        return new AndroidDriver<>(new URL(appiumServerUrl), capabilities);
    }
    
}
