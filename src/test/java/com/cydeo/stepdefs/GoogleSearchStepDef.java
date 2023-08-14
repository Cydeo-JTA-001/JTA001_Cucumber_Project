package com.cydeo.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
    @Given("the user is in the google search page")
    public void the_user_is_in_the_google_search_page() {
        System.out.println("the user is in google search page");
    }
    @When("the user types selenium into the search box")
    public void the_user_types_selenium_into_the_search_box() {
        System.out.println("the user types Selenium");
    }
    @Then("the user should be able to get results")
    public void the_user_should_be_able_to_get_results() {
        System.out.println("the user got successful results");
    }
    @When("the user types maven into the search box")
    public void the_user_types_maven_into_the_search_box() {
        System.out.println("the user types maven into search box");
    }
    @Then("one more step")
    public void one_more_step() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
