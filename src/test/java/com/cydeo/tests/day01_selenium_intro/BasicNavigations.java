package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //setup browser manager
        WebDriverManager.chromedriver().setup();

        //Create instance of chrome browser
        WebDriver driver = new ChromeDriver();

        //go to tesla.com
        driver.get("https://www.tesla.com");

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.get("https://www.google.com");



        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
