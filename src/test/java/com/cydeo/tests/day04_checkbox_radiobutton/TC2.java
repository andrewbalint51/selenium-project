package com.cydeo.tests.day04_checkbox_radiobutton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/abtest");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> list = new ArrayList<>();
        list.addAll(driver.findElements(By.tagName("a")));

        System.out.println(list.size());


        for(WebElement each : list){
            System.out.println("Text of links: "+each.getText());
        }

        for (WebElement each : list){
            System.out.println("HREF Attribute Values: " + each.getAttribute("href"));
        }

        driver.close();




    }

    /*
    TC #2: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
     */
}
