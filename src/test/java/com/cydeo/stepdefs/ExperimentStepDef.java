package com.cydeo.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExperimentStepDef {

    @Given("this")
    public void thiss() {
        System.out.println("This step");
    }
    @When("that")
    public void that() {
        System.out.println("That step");
    }
    @When("another that")
    public void another_that() {
        System.out.println("Another that step");
    }
    @Then("verify all")
    public void verify_all() {
        System.out.println("Verify all step");
    }

    @Given("another stuff")
    public void another_stuff() {
        System.out.println("Another stuff step");
    }
    @Given("verify all again")
    public void verify_all_again() {
        System.out.println("Verify all again step");
    }


}
