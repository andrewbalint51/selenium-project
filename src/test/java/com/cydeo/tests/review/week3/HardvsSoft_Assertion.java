package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoft_Assertion extends TestBase {

    @Test
    public void TC1_HardAssert(){
        driver.get("https://practice.cydeo.com/login");


        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement loginBtn1 = driver.findElement(By.id("wooden_spoon"));
        loginBtn1.click();


        String expectedText = "You logged into a secure area!";
        String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();

        Assert.assertTrue(driver.getTitle().contains("Secure"));
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Test
    public void TC2_SoftAssert(){
        driver.get("https://practice.cydeo.com/login");


        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement loginBtn1 = driver.findElement(By.id("wooden_spoon"));
        loginBtn1.click();

        SoftAssert soft = new SoftAssert();

        String expectedText = "You logged into a secure area!";
        String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();

        //soft.assertTrue(driver.getTitle().equals("top"));
        soft.assertTrue(expectedText.equals("top"));

        soft.assertAll();


    }

}
