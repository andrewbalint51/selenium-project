package com.cydeo.tests.day06_alerts_iframes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC3_JSAlert {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }


    @Test
    public void TC3_InfoAlert(){

        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        infoAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hello");

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "RESULT TEXT NOT DISPLAYED");

        String actual = resultText.getText();
        String expected = "You entered: hello";

        Assert.assertTrue(actual.equals(expected), "TEXT NOT AS EXPECTED: "+actual);

        /*
        TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed.
         */
    }

    @Test
    public void TC2_Confirm(){

        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        infoAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "RESULT TEXT NOT DISPLAYED");

        String actual = resultText.getText();
        String expected = "You clicked: Ok";

        Assert.assertTrue(actual.equals(expected), "TEXT NOT AS EXPECTED");


        /*
        TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
         */
    }


    @Test
    public void TC1_informationAlert() throws InterruptedException {


        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlertButton.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "RESULT TEXT NOT DISPLAYED");

        String actual = resultText.getText();
        String expected = "You successfully clicked an alert";

        Assert.assertTrue(actual.equals(expected), "TEXT NOT AS EXPECTED");

        /*
        TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
         */
    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
