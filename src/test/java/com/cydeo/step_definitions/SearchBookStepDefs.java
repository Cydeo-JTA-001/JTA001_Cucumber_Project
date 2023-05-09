package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchBookStepDefs {
    @Given("the Student is on the login page")
    public void the_student_is_on_the_login_page() {

    }
    @When("the student enters credentials")
    public void the_student_enters_credentials() {
        WebElement username= Driver.getDriver().findElement(By.xpath("//input[@id='inputEmail']"));
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@id='inputPassword']"));

        username.sendKeys(ConfigurationReader.getProperty("student_username"));  //pull data from configuration.properties  --- ConfigurationReader.getProperty()
        password.sendKeys(ConfigurationReader.getProperty("student_password"));


    }
    @When("the student clicks sign in")
    public void the_student_clicks_sign_in() {
       WebElement signinButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
       signinButton.click();

    }
    @When("the student enters book name {string} into search box")
    public void the_student_enters_book_name_into_search_box(String searchBook) throws InterruptedException {
  Thread.sleep(5000);
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
  searchBox.sendKeys(searchBook);
    }
    @Then("the student should see the book {string} in the list")
    public void theStudentShouldSeeTheBookInTheList(String searchBook) {
       WebElement title=Driver.getDriver().findElement(By.xpath("//tbody//td[.='"+searchBook+"']"));
        Assert.assertTrue(title.getText().equals(searchBook));
    }


}
