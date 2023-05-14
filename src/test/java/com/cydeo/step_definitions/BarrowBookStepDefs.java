package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BarrowBookStepDefs {

    @When("the user clicks first borrow book button")
    public void the_user_clicks_first_borrow_book_button() {
        Driver.getDriver().findElement(By.xpath("//*[@class=\"btn btn-primary btn-sm  \"]")).click();
    }
    @Then("the user see the confirmation message")
    public void the_user_see_the_confirmation_message() {
        Assert.assertTrue("Confirmation message did not appear", Driver.getDriver().findElement(By.xpath("//*[@class=\"toast-message\"]")).isDisplayed());

       // Driver.closeDriver();     this step is executed in Hooks in After method

    }

    @Given("the user is on the login pagea")
    public void the_user_is_on_the_login_pagea() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters valid credentialsa")
    public void the_user_enters_valid_credentialsa() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks sign ina")
    public void the_user_clicks_sign_ina() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks first borrow book buttona")
    public void the_user_clicks_first_borrow_book_buttona() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user see the confirmation messagea")
    public void the_user_see_the_confirmation_messagea() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
