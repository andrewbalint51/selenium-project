package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertPractice extends TestBase {

    @Test
    public void alertsPractice(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement JSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JSPrompt.click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hello");
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        SoftAssert softAssert = new SoftAssert();

        String expected = "You entered: hello";
        String actual = result.getText();

        softAssert.assertTrue(expected.equals(actual));
        softAssert.assertAll();

        Assert.assertEquals(expected, actual);


    }

    /*
    // TC : Alert practice
// 1. Open browser
// 2. Go to website: https://practice.cydeo.com/javascript_alerts
// 3. Click to “Click for JS Prompt” button
// 4. Send “hello” text to alert
// 5. Click to OK button from the alert
// 6. Verify “You entered: hello” text is displayed.
     */
}
