package com.cydeo.tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver openChrome(){
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup(); //Setup chrome

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver getDriver(String browser){

        WebDriver driver;

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup(); //Setup chrome

            return new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();
        }
        else {
            System.err.println("Given String doesn't represent a browser");
            System.err.println("Browser either doesn't exist or is unsupported");
            System.err.println("driver = null");
            return null;
        }


    }

}
