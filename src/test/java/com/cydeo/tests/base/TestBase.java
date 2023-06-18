package com.cydeo.tests.base;

import com.cydeo.tests.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();

    }


    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
}
