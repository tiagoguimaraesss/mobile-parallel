package br.com.tiago.test;

import modelo.Pessoa;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.MenuPage;
import page.SuccessPage;
import util.TestRule;

import static java.lang.String.format;
import static org.testng.Assert.assertEquals;

public class SmokeTest extends TestRule {

    @Test(dataProvider = "getPessoa")
    public void deveriaExibirDadosDigitadosTest(Pessoa pessoa) {
        MenuPage menu = new MenuPage(driver);

        SuccessPage success = menu.inputUserInfo(pessoa);
        assertEquals(format("Your name is %s and you are %s years old!", pessoa.getName(), pessoa.getAge()), success.getMessageTextView().getText());
    }

    @DataProvider(name = "getPessoa")
    public static Object[][] getPessoa() {
        return new Object[][] {
            {new Pessoa("Tiago", "25")}
        };
    }

}
