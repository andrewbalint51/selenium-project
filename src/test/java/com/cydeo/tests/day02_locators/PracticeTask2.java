package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //Setup chrome

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //Click to AB testing
        WebElement ABTestLink = driver.findElement(By.linkText("A/B Testing"));
        ABTestLink.click();

        //Compare current title with expected title
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }
        else{
            System.out.println("Title verification FAILED!");
        }

        //Go back to home page
        driver.navigate().back();

        //Verify title of home page
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }
        else{
            System.out.println("Title verification FAILED!");
        }








    }
}
