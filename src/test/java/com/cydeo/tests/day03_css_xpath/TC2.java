package com.cydeo.tests.day03_css_xpath;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedText = "Remember me on this computer";
        String actualText = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        expectedText = "FORGOT YOUR PASSWORD?";
        actualText = driver.findElement(By.className("login-link-forgot-pass")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        expectedText = "forgot_password=yes";
        actualText = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");


        if(actualText.contains(expectedText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.close();
    }

    /*
    HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
     */
}
