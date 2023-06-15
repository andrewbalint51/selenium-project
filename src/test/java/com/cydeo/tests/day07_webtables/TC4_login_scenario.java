package com.cydeo.tests.day07_webtables;

import com.cydeo.tests.Utilities.BrowserUtils;
import com.cydeo.tests.Utilities.CRMUtils;
import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC4_login_scenario {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://login1.nextbasecrm.com/");

    }

    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void Test1_CRM_Login(){

        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        login.sendKeys("hr1@cybertekschool.com");
        password.sendKeys("UserUser");


        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver, "(1) Portal");
    }


    @Test
    public void Test1_CRM_Login2(){

        CRMUtils.loginSRM(driver, "hr1@cybertekschool.com","UserUser");

        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver, "(1) Portal");
    }


    /*
    TC #4: Login scenario
1. Create new test and make set ups
2. Go to: http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal
     */
}
