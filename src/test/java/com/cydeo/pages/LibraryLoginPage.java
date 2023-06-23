package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']//div")
    public WebElement fieldRequiredMessage;

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@id='inputEmail-error']")
    public WebElement invalidFormatMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement invalidCredentialsMessage;


    /*
    TC #7: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
     */
}
