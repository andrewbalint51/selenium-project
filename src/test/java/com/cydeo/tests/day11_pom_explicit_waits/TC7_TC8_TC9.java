package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_TC8_TC9 {

    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setup(){

        loginPage = new LibraryLoginPage();
        Driver.getDriver().get("https://library1.cydeo.com");

    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }

    @Test
    public void TC7(){
        /*
        TC #7: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
         */



        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.fieldRequiredMessage.isDisplayed());
    }

    @Test
    public void TC8(){
        /*
        TC #8: Invalid email format error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter invalid email format
4- Verify expected error is displayed:
Expected: Please enter a valid email address.

NOTE: FOLLOW POM DESIGN PATTERN
         */

        loginPage.emailBox.sendKeys("blah");
        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.invalidFormatMessage.isDisplayed());

    }

    @Test
    public void TC9(){

        /*
        TC #9: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password

NOTE: FOLLOW POM DESIGN PATTERN
         */

        loginPage.emailBox.sendKeys("blah@kjf.com");
        loginPage.passwordBox.sendKeys("somethingbad");
        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.invalidCredentialsMessage.isDisplayed());

    }

}
