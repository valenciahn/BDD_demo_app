package org.example.acceptancetests;

import net.thucydides.core.annotations.Step;
import org.example.pageobject.BankMainPage;
import org.example.pageobject.BankSearchPage;

import static org.junit.Assert.assertEquals;

public class BankUser {

    String actor;
    BankMainPage mainPage;
    BankSearchPage searchPage;

    @Step("#actor ingresa a la pagina principal")
    public void openMainPage() {
        mainPage.open();
    }

    @Step("#actor da click en link de pagina de busqueda")
    public void goToSearchPage() {
        mainPage.goToSearchPage();
    }

    @Step("#actor ingresa el numero ed cuenta en el texbox")
    public void keyAccountNumber(String accountNumber) {
        searchPage.keyOnSearchTextBox(accountNumber);
        searchPage.clickOnFindBotton();
    }
    @Step("#actor valida que se muestra la pagina de detalles de la cuenta")
    public void checkDetailsTitle(String title) {
        String txt = searchPage.getDetailsTitle(title);
        assertEquals(title,txt);

    }
}
