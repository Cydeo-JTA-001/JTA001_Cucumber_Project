package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("user is on the login page of the library application")
    public void userIsOnTheLoginPageOfTheLibraryApplication() {
        System.out.println("user is on the page");
    }




//    @When("user enters student username")
//    public void userEntersStudentUsername() {
//        System.out.println("user enters student username");
//    }

    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {
        System.out.println("user enters username Librarian");
    }

    @And("user enters librarian password")
    public void userEntersLibrarianPassword() {
        System.out.println("user enters librarian password");
    }


    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("user see the dashboard");
    }


    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student apss");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("user enters admin username");

    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admn password");

    }


}
