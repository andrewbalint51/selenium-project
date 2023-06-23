package com.cydeo.tests.day05_testNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4_TestNG {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://www.cydeo.com");
    }

    @Test
    public void testCydeo(){


        Assert.assertEquals(driver.getTitle(), "Cydeo");
    }

    @AfterMethod
    public void closeWindow(){
        driver.close();
    }



    /*
    TC #4: Cydeo Title Verification
1.Open Chrome browser
2.Go to https://www.cydeo.com
3.Verify title:
Expected: Cydeo
     */
}
