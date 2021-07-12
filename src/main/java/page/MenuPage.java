package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import modelo.Pessoa;

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
	
	public SuccessPage inputUserInfo(Pessoa pessoa) {
		nameEditText.sendKeys(pessoa.getName());
		ageEditText.sendKeys(pessoa.getAge());
		nextButton.click();
		
		return new SuccessPage(driver);
	}
	
}
