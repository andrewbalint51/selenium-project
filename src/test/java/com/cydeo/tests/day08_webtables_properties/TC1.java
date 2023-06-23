package com.cydeo.tests.day08_webtables_properties;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/web-tables");

    }


    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void TC1_Verify_Bob(){
        WebElement bobName = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        String expectedName = "Bob Martin";
        String actualName = bobName.getText();

        Assert.assertTrue(actualName.equals(expectedName));

        String expectedDate = "12/31/2021";

        WebOrderUtils.orderVerify(driver, actualName, expectedDate);

       /* WebElement bobOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = WebOrderUtils.returnOrderDate(driver, actualName);

        Assert.assertTrue(expectedDate.equals(actualDate));*/
    }
    /*
    1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
     */
}
