package com.cydeo.tests.day02_locators;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.openChrome();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeButton = driver.findElement(By.className("nav-link"));
        homeButton.click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }



    }

    /*
    TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
     */
}
