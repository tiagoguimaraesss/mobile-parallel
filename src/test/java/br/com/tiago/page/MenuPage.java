package br.com.tiago.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends PageObject{

	public MenuPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "textInputEditTextName")
	private MobileElement nameEditText;
	
	@AndroidFindBy(id = "textInputEditTextAge")
	private MobileElement ageEditText;
	
	@AndroidFindBy(id = "btnOk")
	private MobileElement nextButton;
	
	public SuccessPage inputUserInfo(String name, String age) {
		nameEditText.sendKeys(name);
		ageEditText.sendKeys(age);
		nextButton.click();
		
		return new SuccessPage(driver);
	}
	
}
