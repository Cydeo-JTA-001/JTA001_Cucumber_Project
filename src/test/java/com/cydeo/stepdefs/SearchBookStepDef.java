package com.cydeo.stepdefs;

import com.cydeo.pages.DashBoardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchBookStepDef {
    DashBoardPage dashBoardPage=new DashBoardPage();
    @When("the user searches Hello Python book")
    public void the_user_searches_hello_python_book() throws InterruptedException {
        dashBoardPage.searchBox.sendKeys("Hello Python");
        Thread.sleep(2000);
    }

    @When("the user searches {string} book")
    public void theUserSearchesBook(String bookName) throws InterruptedException {
        dashBoardPage.searchBox.sendKeys(bookName);
        Thread.sleep(2000);
    }
    @Then("the user should see the result")
    public void the_user_should_see_the_result() {
        Assert.assertTrue(dashBoardPage.result.isDisplayed());
    }


}
