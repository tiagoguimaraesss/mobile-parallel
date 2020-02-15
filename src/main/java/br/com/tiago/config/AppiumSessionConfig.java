package br.com.tiago.config;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumSessionConfig {

    DesiredCapabilities capabilities = new DesiredCapabilities();

    public AndroidDriver<MobileElement> getAndroidDriverSession(String deviceName, String udid, int systemPort, String appiumServerUrl) throws MalformedURLException {
    	capabilities.setCapability("deviceName", deviceName);
    	capabilities.setCapability("udid", udid);
    	capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("systemPort", systemPort);
        capabilities.setCapability("skipDeviceInitialization", true);
        capabilities.setCapability("skipServerInstallation", true);
    	//capabilities.setCapability(MobileCapabilityType.APP, new File("app/app-debug.apk").getAbsolutePath());
        capabilities.setCapability("appPackage", "br.com.lucasbieniek.aat");
        capabilities.setCapability("appActivity", "br.com.lucasbieniek.aat.views.MainActivity");

        return new AndroidDriver<>(new URL(appiumServerUrl), capabilities);
    }
    
}
