package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3SchoolsTryIt {

    //Creat constructor and initialize
    public W3SchoolsTryIt(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//p[@id='demo']")
    public WebElement paragraph;
}
