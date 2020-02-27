package br.com.tiago.test;

import br.com.tiago.page.MenuPage;
import br.com.tiago.page.SuccessPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SmokeTest extends TestBase {

    @Test
    public void justATest() {
    	final String name = "Tiago", age = "25";
        MenuPage menu = new MenuPage(driver);

        SuccessPage success = menu.inputUserInfo(name, age);
        assertEquals(String.format("Your name is %s and you are %s years old!", name, age), success.messageViewGetText());
    }

}
