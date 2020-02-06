package br.com.tiago.config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceConfig {

    DesiredCapabilities capabilities = new DesiredCapabilities();

    @SuppressWarnings("rawtypes")
    public AndroidDriver androidCapabilities(String udid, String platformVersion, int systemPort, String deviceName, String appiumServerUrl) throws MalformedURLException {
        capabilities.setCapability(MobileCapabilityType.APP, new File("app/app-debug.apk").getAbsolutePath());
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "br.com.lucasbieniek.aat");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "br.com.lucasbieniek.aat.views.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.UDID, udid);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

        return new AndroidDriver(new URL(appiumServerUrl), capabilities);
    }

}
