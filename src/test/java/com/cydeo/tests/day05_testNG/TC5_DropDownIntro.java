package com.cydeo.tests.day05_testNG;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC5_DropDownIntro {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownsTest(){

        WebElement simpleDropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(simpleDropDown);

        String expected = "Please select an option";
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void stateSelectTest(){
        WebElement stateDropDown = driver.findElement(By.xpath("//select[@id='state']"));

        Select select = new Select(stateDropDown);

        String expected = "Select a State";
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expected, actual);
    }

    @AfterClass
    public void closeWindow(){
        driver.close();
    }
    /*
    TC#5: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
     */
}
