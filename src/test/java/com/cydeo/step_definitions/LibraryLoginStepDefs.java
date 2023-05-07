package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LibraryLoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("env"));  this step is executed in Hooks Unders Before method
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        Driver.getDriver().findElement(By.xpath("//*[@id='inputEmail']")).sendKeys(ConfigurationReader.getProperty("student_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='inputPassword']")).sendKeys(ConfigurationReader.getProperty("student_password"));
    }

    @And("the user clicks sign in")
    public void the_user_clicks_sign_in() {

        Driver.getDriver().findElement(By.xpath("//*[@type=\"submit\"]")).click();

    }


    @Then("the student lands on home page")
    public void theStudentLandsOnHomePage() {
        String actualText = Driver.getDriver().findElement(By.xpath("//*[@class=\"title\"][.=\"Books\"]")).getText();
        String expectedText = "Books";

        Assert.assertEquals(actualText,expectedText);

        // Driver.closeDriver();   this step is executed in Hooks in After method

    }


    @When("the librarian enters valid credentials")
    public void the_librarian_enters_valid_credentials() {
        Driver.getDriver().findElement(By.xpath("//*[@id='inputEmail']")).sendKeys(ConfigurationReader.getProperty("librarian_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='inputPassword']")).sendKeys(ConfigurationReader.getProperty("librarian_password"));
    }
    @Then("the librarian lands on home page")
    public void the_librarian_lands_on_home_page() {

        String actualText = Driver.getDriver().findElement(By.xpath("//*[@class=\"title\"][.=\"Dashboard\"]")).getText();
        String expectedText = "Dashboard";

        Assert.assertEquals(actualText,expectedText);

       // Driver.closeDriver();    this step is executed in Hooks in After method

    }

}
