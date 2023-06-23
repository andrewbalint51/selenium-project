package com.cydeo.tests.day09_java_faker_driverUtils;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1_Bing {

    /*
    TC #1: Bing search
1- Open a chrome browser
2- Go to: https://bing.com
3- Write “apple” in search box
4- Verify title:

Expected: apple - Search
     */

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void TC1(){

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue"));
        searchBox.sendKeys(Keys.ENTER);

        BrowserUtils.verifyTitle(driver, ConfigurationReader.getProperty("searchValue")+" - Search");

    }

}
