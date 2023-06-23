package com.cydeo.tests.day04_checkbox_radiobutton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {


        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();




        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        Thread.sleep(2000);

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        //b. “Forgot password” header

        WebElement FPHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        FPHeader = driver.findElement(By.cssSelector("div[class='example'] > h2"));
        //c. “E-mail” text

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box

        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z0')]"));
        //e. “Retrieve password” button

        WebElement retrievePassword = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        //f. “Powered by Cydeo text
        WebElement PBC = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("FPHeader.isDisplayed() = " + FPHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("PBC.isDisplayed() = " + PBC.isDisplayed());

        Thread.sleep(2000);


        driver.close();
    }

    /*
    TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
     */
}
