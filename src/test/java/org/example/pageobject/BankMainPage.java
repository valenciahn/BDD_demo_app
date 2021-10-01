package org.example.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://192.168.1.121:3333/accounts/")
public class BankMainPage extends PageObject {

    @FindBy(linkText = "Search")
    WebElementFacade linkToSearchPage;

    public void goToSearchPage() {
        linkToSearchPage.click();
    }
}
