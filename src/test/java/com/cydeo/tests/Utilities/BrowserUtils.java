package com.cydeo.tests.Utilities;

/*
This class will be storing utility methods that can be used across the project
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {


    /*
    This method will accept an integer in seconds and run Thread.sleep for the input duration
    Args: int seconds
     */
    public static void sleep(int seconds)
    {
        seconds*=1000;
        try{
            Thread.sleep(seconds);
        }
        catch (InterruptedException e){

        }
    }

    /*
    This method switches to the window with the specified URL and verifies the window's title
    WebDriver driver, String expectedInURL, String expectedInTitle
     */

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        Set<String> handles = driver.getWindowHandles();

        for (String each : handles) {

            driver.switchTo().window(each);
            if(driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method verifies if the current title is as expected
    Args: WebDriver driver, String expectedTitle
     */

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public static void verifyTitleContains(WebDriver driver, String expectedInTitle){

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }




}