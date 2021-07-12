package br.com.tiago.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SuccessPage extends PageObject{

	public SuccessPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "tvResult")
	private MobileElement messageTextView;
	
	public String messageViewGetText() {
		return messageTextView.getText();
	}
	
}
