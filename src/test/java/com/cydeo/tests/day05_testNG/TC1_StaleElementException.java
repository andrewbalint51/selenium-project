package com.cydeo.tests.day05_testNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC1_StaleElementException {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));

        System.out.println("deleteButton.isDisplayed(), expecting true = " + deleteButton.isDisplayed());

        Thread.sleep(2000);
        deleteButton.click();

        try {
            System.out.println("deleteButton.isDisplayed(), expecting false = " + deleteButton.isDisplayed());
        }
        catch (StaleElementReferenceException e){
            System.out.println("deleteButton.isDisplayed(), expecting false = false");
        }


        driver.close();
    }
    /*
    TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */
}
