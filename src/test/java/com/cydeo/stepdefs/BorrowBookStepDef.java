package com.cydeo.stepdefs;

import com.cydeo.pages.DashBoardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class BorrowBookStepDef {
     LoginPage loginPage=new LoginPage();
     DashBoardPage dashBoardPage=new DashBoardPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
       loginPage.userName.sendKeys(ConfigurationReader.getProperty("student_username"));
       loginPage.passWord.sendKeys(ConfigurationReader.getProperty("student_password"));
    }
    @When("the user clicks sign in button")
    public void the_user_clicks_sign_in_button() {
      loginPage.signIn.click();
    }
    @When("the user clicks first borrow book button")
    public void the_user_clicks_first_borrow_book_button() {
        // click show records dropdown
        Select select=new Select(dashBoardPage.recordsDropdown);
        select.selectByValue("100");

    }
    @Then("the user see the confirmation message")
    public void the_user_see_the_confirmation_message() {

    }
}
