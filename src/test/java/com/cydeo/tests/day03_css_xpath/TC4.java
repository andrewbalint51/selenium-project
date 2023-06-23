package com.cydeo.tests.day03_css_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");



        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));

        String expectedText = "Log In";
        String actualText = loginButton.getAttribute("value");

        if(actualText.equals(expectedText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.close();

    }
}
