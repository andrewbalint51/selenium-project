package com.cydeo.tests.day08_webtables_properties;

import com.cydeo.tests.Utilities.BrowserUtils;
import com.cydeo.tests.Utilities.ConfigurationReader;
import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC4_UseConfigReader {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("googleURL"));

    }


    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void searchTest(){


        WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
        element.sendKeys(ConfigurationReader.getProperty("keyword"));
        element.sendKeys(Keys.ENTER);


        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver, ConfigurationReader.getProperty("expectedTitle"));




        /*
        TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search
         */
    }

}
