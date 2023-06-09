package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask5 {
    public static void main(String[] args) {


        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup(); //Setup chrome

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));

        String expected = "Registration form";
        String actual = header.getText();

        if(expected.equals(actual)){
            System.out.println("Header verification PASSED!");
        }
        else{
            System.out.println("Header verification FAILED!");
        }

        WebElement firstNameBox = driver.findElement(By.className("form-control"));

        expected = "first name";
        actual = firstNameBox.getAttribute("placeholder");

        if(expected.equals(actual)){
            System.out.println("Placeholder verification PASSED!");
        }
        else{
            System.out.println("Placeholder verification FAILED!");
        }

    }

    /*
    TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
     */
}
