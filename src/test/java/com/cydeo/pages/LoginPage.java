package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;


}
