package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;

@Getter
public class SuccessPage extends PageObject{

	public SuccessPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "tvResult")
	private MobileElement messageTextView;
	
}
