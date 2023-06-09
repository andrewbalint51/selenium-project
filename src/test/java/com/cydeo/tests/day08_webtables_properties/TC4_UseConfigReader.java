package com.cydeo.tests.day08_webtables_properties;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC4_UseConfigReader extends TestBase {



    @Test
    public void searchTest(){


        driver.get(ConfigurationReader.getProperty("googleURL"));
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
