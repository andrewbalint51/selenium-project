package com.cydeo.tests.day10_JSExecutor;

import com.cydeo.tests.Utilities.BrowserUtils;
import com.cydeo.tests.Utilities.ConfigurationReader;
import com.cydeo.tests.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class day10_TC1 {
    /*
    TC#1: Registration form confirmation
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.

     */

    @Test
    public void TC1(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        Faker faker = new Faker();

        Driver.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys("Andrew");
        Driver.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys("Balint");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("dewman51");
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(faker.bothify("bbbbb789@"));
        Driver.getDriver().findElement(By.xpath("//input[@name='phone']")).sendKeys("636-235-6161");


        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys("12/16/1992");

        Select selectDept = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        selectDept.selectByVisibleText("Department of Engineering");

        BrowserUtils.sleep(3);

        Select selectJobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        selectJobTitle.selectByVisibleText("SDET");

        Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();


        Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']")).click();


        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));

        Assert.assertTrue(successMessage.isDisplayed());


        BrowserUtils.sleep(2);


    }


    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }

}
