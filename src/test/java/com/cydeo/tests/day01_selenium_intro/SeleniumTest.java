package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //Set up webdrivermanager
        WebDriverManager.chromedriver().setup();

        //Create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //Test Driver
        driver.get("https://www.google.com");

    }
}
