package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefs {

    @Given("user is on Google Page")
    public void user_is_on_google_page() {
        System.out.println("user is on google page");

    }

    @When("user types Wooden Spoon on SearchBox")
    public void user_types_wooden_spoon_on_search_box() {
        System.out.println("User types keyword Wooden Spoon for search");
    }


    @When("the User hits enter")
    public void the_user_hits_enter() {
        System.out.println("user hits enter");
    }
    @Then("user see the results")
    public void user_see_the_results() {

        System.out.println("user verifies the results");
    }



}
