package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
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
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class=\"toast-message\"]")).isDisplayed());

       // Driver.closeDriver();     this step is executed in Hooks in After method

    }


}
