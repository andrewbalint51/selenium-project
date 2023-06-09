package com.cydeo.tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {

    public void openChrome(){
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup(); //Setup chrome

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

}
