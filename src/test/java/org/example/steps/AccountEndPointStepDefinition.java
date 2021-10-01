package org.example.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;

import static net.serenitybdd.rest.RestRequests.expect;
import static org.hamcrest.CoreMatchers.*;

public class AccountEndPointStepDefinition {

    private String url;
    private String accountNumber;
    private String owner;

    @Given("I have this url:{string}")
    public void iHave(String url){
        this.url = url;
    }

    @When("I look for this account number {string}")
    public void iSetThis(String accountNumber) {
        this.accountNumber=accountNumber;
    }

    @Then("I should see {string} as owner")
    public void iShouldSee(String owner) {
        expect().statusCode(200).and().body("owner", equalTo(owner)).when().get(url+"{accountNumber}",accountNumber);
    }

    @When("I look for this owner {string}")
    public void iLookForThisOwner(String owner) {
        this.owner = owner;
    }

    @Then("I should see {string} as accountNumber")
    public void iShouldSeeAsAccountNumber(String accountNumber) {
        Response response =expect().statusCode(200).when().get(url+"{owner}",owner);
        ArrayList account= response.getBody().jsonPath().get("number");
        Assert.assertEquals(String.valueOf(account.get(0)),accountNumber);
    }

    @Then("I should see {string} as http code")
    public void iShouldSeeAsHttpCode(String httpCode) {
        expect().statusCode(404).when().get(url+"{accountNumber}",accountNumber);
    }
}
