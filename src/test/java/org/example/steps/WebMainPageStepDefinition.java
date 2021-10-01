package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.acceptancetests.BankUser;
import org.openqa.selenium.WebDriver;

public class WebMainPageStepDefinition {

    @Managed
    WebDriver driver;

    @Steps
    BankUser accountManager;

    @Given("account manger navigate to bank page")
    public void userEnterBankPage(){
        accountManager.openMainPage();
    }

    @And("go to search page")
    public void goToSearchPage() {
        accountManager.goToSearchPage();
    }

    @When("account manager look for this account number {string}")
    public void accountManagerLookForThisAccountNumber(String accountNumber) {
        accountManager.keyAccountNumber(accountNumber);

    }

    @Then("account manager should see {string} title")
    public void accountManagerShouldSeeTitle(String title) {
        accountManager.checkDetailsTitle(title);
    }
}
