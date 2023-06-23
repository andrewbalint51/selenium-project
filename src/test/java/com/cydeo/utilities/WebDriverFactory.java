package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    public static WebDriver openChrome(){

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

    public static WebDriver getDriver(String browser){


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
