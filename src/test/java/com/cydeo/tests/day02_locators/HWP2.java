package com.cydeo.tests.day02_locators;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.openChrome();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.tagName("h3"));

        String expectedTitle = "Log in to ZeroBank";
        String actualTitle = header.getText();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }


    }
    /*
    HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
     */
}
