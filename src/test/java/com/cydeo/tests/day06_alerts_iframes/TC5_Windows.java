package com.cydeo.tests.day06_alerts_iframes;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC5_Windows {

    WebDriver driver;
    String mainHandle;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void TC5(){

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle), "TITLE NOT AS EXPECTED");

        mainHandle = driver.getWindowHandle();

        WebElement element = driver.findElement(By.xpath("//a[.='Click Here']"));
        
        element.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
        }

        expectedTitle = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        driver.switchTo().window(mainHandle);

        /*
        TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
         */
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}
