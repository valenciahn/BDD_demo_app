package org.example.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BankSearchPage extends PageObject {

    @FindBy(css = "#number")
    WebElementFacade searchNumberTextBox;
    @FindBy(xpath = "//button[contains(text(),'Find')]")
    WebElementFacade findButton;
    @FindBy(xpath = "//body//h1")
    WebElementFacade detailsTitle;

    public void keyOnSearchTextBox(String accountNumber) {
        searchNumberTextBox.sendKeys(accountNumber);
    }

    public void clickOnFindBotton() {
        findButton.click();
    }

    public String getDetailsTitle(String title) {
        String txt = "";
        if(detailsTitle!=null){
            txt = detailsTitle.getTextContent();
        }
        return txt;
    }
}
