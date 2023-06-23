package com.cydeo.tests.day10_JSExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC4_TC5 {

    /*
    TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method

TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
     */

    @Test
    public void TC4_TC5(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(cydeoLink).perform();

        BrowserUtils.sleep(2);

        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        BrowserUtils.sleep(2);

        Driver.closeDriver();


    }



}
