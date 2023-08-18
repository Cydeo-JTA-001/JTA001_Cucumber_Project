package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    public DashBoardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement recordsDropdown;

    @FindBy(xpath = "//td/a[@onclick='Books.borrow_book(16702)']")
    public WebElement aborrowbookButton;
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement warningMessage;

@FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;
@FindBy(xpath = "//div[@id='tbl_books_info']")
    public WebElement result;

}
