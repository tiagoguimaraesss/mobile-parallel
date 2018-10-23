package br.com.tiago.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import br.com.tiago.page.MenuPage;
import br.com.tiago.page.SuccessPage;

public class SmokeTest extends BaseTest{
	
	@Test
	public void justATest() {
		MenuPage menu = new MenuPage(driver);
		
		SuccessPage success = menu.inputUserInfo("Tiago", "25");
		assertEquals("Your name is Tiago and you are 25 years old!", success.messageViewGetText());
	}
	
}
