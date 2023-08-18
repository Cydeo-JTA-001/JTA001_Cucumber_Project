package com.cydeo.stepdefs;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("user is on the loginpage");
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println(ConfigurationReader.getProperty("librarian_username"));
       loginPage.userName.sendKeys(ConfigurationReader.getProperty("librarian_username"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() throws InterruptedException {
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.signIn.click();
        Thread.sleep(5000);


    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
       String expectedTitle="Library";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("student_username"));
    }
    @When("user enters student password")
    public void user_enters_student_password() throws InterruptedException {
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("student_password"));
        loginPage.signIn.click();
        Thread.sleep(5000);
    }
    @When("user enters admin username")
    public void user_enters_admin_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("admin_username"));
    }
    @When("user enters admin password")
    public void user_enters_admin_password() throws InterruptedException {
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("admin_password"));
        loginPage.signIn.click();
        Thread.sleep(5000);
    }

}
