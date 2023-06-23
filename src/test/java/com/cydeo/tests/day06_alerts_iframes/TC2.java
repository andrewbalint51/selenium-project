package com.cydeo.tests.day06_alerts_iframes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC2 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void closeWindow(){
        driver.close();
    }

    @Test
    public void dropdownTask6(){

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByValue("IL");
        stateDropdown.selectByVisibleText("Virginia");
        stateDropdown.selectByIndex(5);

        String expectedText = "California";
        String actualText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(expectedText.equals(actualText), "ACTUAL STATE IS NOT EQUAL TO EXPECTED STATE!");

    }

    @Test
    public void dropdownTask8() throws InterruptedException {

        WebElement linkDropdown = driver.findElement(By.xpath("//a[@role='button']"));

        linkDropdown.click();
        Thread.sleep(3000);

        WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();
        String actualTitle= driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        System.out.println(actualTitle);
        System.out.println(expectedTitle);

        Assert.assertTrue(actualTitle.equals(expectedTitle), "EXPECTED TITLE AND ACTUAL TITLE DO NOT MATCH");

        /*
        TC #8: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
         */
    }


    /*
    TC #7: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
     */
}
