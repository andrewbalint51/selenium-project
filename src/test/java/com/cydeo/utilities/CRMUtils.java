package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
This class contains methods to be used for our CRM project
 */

public class CRMUtils {


    /*
    This method is used when we know the user credentials.
    Use with caution, credentials are hard coded.
    Args: WebDriver driver
     */

    public static void loginSRM(WebDriver driver){
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        login.sendKeys("hr1@cybertekschool.com");
        password.sendKeys("UserUser");


        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }

    /*
    This method logs in to the CRM. It accepts a username and password

   Args: WebDriver driver, String userName, String password
     */

    public static void loginSRM(WebDriver driver, String userName, String password){
        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        usernameBox.sendKeys(userName);
        passwordBox.sendKeys(password);


        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }

}
