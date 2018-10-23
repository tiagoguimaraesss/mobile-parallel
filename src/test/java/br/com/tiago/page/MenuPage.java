package br.com.tiago.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends PageObject{

	public MenuPage(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "br.com.lucasbieniek.aat:id/textInputEditTextName")
	private MobileElement nameEditText;
	
	@AndroidFindBy(id = "br.com.lucasbieniek.aat:id/textInputEditTextAge")
	private MobileElement ageEditText;
	
	@AndroidFindBy(id = "br.com.lucasbieniek.aat:id/btnOk")
	private MobileElement nextButton;
	
	public SuccessPage inputUserInfo(String name, String age) {
		nameEditText.sendKeys(name);
		ageEditText.sendKeys(age);
		nextButton.click();
		
		return new SuccessPage(driver);
	}
	
}
