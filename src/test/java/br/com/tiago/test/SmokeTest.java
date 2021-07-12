package br.com.tiago.test;

import modelo.Pessoa;
import org.testng.annotations.Test;
import page.MenuPage;
import page.SuccessPage;
import util.TestRule;

import static java.lang.String.format;
import static org.testng.Assert.assertEquals;

public class SmokeTest extends TestRule {

    @Test
    public void deveriaExibirDadosDigitadosTest() {
        Pessoa tiago = new Pessoa("Tiago", "25");
        MenuPage menu = new MenuPage(driver);

        SuccessPage success = menu.inputUserInfo(tiago);
        assertEquals(format("Your name is %s and you are %s years old!", tiago.getName(), tiago.getAge()), success.getMessageTextView().getText());
    }

}
