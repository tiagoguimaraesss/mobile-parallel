package page;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObject {
	
	protected AndroidDriver<MobileElement> driver;
	
	public PageObject(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
	}
	
}
