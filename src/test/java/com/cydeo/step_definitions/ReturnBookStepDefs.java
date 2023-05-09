package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class ReturnBookStepDefs {
    @And("the user clicks Borrowing Books")
    public void theUserClicksBorrowingBooks() {
        Driver.getDriver().findElement(By.xpath("//*[@class=\"title\"][.=\"Borrowing Books\"]")).click();

    }

    @And("the user clicks Return Book")
    public void theUserClicksReturnBook() {
        Driver.getDriver().findElement(By.xpath("//*[@class=\"btn btn-primary btn-sm \"]")).click();

    }



}
