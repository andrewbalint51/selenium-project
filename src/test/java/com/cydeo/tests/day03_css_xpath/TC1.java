package com.cydeo.tests.day03_css_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("firefox");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        WebElement loginButton = driver.findElement(By.className("login-btn"));

        username.sendKeys("incorrect");
        password.sendKeys("incorrect");
        loginButton.click();


        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }




    }

    /*
    TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

PS: Inspect and decide which locator you should be using to locate web
elements.
     */
}
