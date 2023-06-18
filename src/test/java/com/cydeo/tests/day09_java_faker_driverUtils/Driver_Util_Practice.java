package com.cydeo.tests.day09_java_faker_driverUtils;

import com.cydeo.tests.Utilities.BrowserUtils;
import com.cydeo.tests.Utilities.ConfigurationReader;
import com.cydeo.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Driver_Util_Practice {


    /*WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }
*/
    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }

    @Test
    public void TC1(){

        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@id='sb_form_q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue"));
        searchBox.sendKeys(Keys.ENTER);

        BrowserUtils.verifyTitle(Driver.getDriver(), ConfigurationReader.getProperty("searchValue")+" - Search");

    }
}
