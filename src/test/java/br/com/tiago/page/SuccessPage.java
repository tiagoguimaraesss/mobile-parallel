package br.com.tiago.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SuccessPage extends PageObject{

	public SuccessPage(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "br.com.lucasbieniek.aat:id/tvResult")
	private MobileElement messageTextView;
	
	public String messageViewGetText() {
		return messageTextView.getText();
	}
	
}
