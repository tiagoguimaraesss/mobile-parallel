package config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class AppiumSessionConfig {

    public AndroidDriver<MobileElement> getAndroidDriverSession(String deviceName, String udid, int systemPort, String appiumServerUrl) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(DEVICE_NAME, deviceName);
    	capabilities.setCapability(UDID, udid);
        capabilities.setCapability("systemPort", systemPort);
        capabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");
    	capabilities.setCapability(APP, new File("app/app-debug.apk").getAbsolutePath());

        return new AndroidDriver<>(new URL(appiumServerUrl), capabilities);
    }
    
}
