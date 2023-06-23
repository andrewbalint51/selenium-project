package com.cydeo.tests.day12_review;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC2_ExplicitWait {


    DynamicControlsPage page;

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        page = new DynamicControlsPage();
    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
    /*
    TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.
NOTE: FOLLOW POM
     */
    @Test
    public void TC2_RemoveCheckbox(){

        page.removeButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(page.waitForIt));

        try {
            Assert.assertFalse(page.checkbox.isDisplayed());
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("NoSuchElementExcxeption thrown. Checkbox is not displayed. Test passed.");
        }

        Assert.assertTrue(page.itsGoneMessage.isDisplayed());


    }

    @Test
    public void TC3_ExplicitWait(){
        /*
        TC #3: Explicit wait practice
3- Click to “Enable” button
4- Wait until “loading bar disappears”
5- Verify:
a. Input box is enabled.
b. “It’s enabled!” message is displayed.
NOTE: FOLLOW POM
         */

        page.enableBox.click();
        BrowserUtils.waitForInvisibilityOf(page.waitForIt);

        Assert.assertTrue(page.inputBox.isEnabled());
        Assert.assertTrue(page.itsEnabledMessage.isDisplayed());


        Assert.assertTrue(page.itsEnabledMessage.getText().equals("It's enabled!"));


    }

}
