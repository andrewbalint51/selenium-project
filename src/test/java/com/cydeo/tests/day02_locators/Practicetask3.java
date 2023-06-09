package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetask3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //Setup chrome

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //go to www.google.com
        driver.navigate().to("https://www.google.com");

        //3- Write “apple” in search box
        //Locate Search box

        WebElement searchBox = driver.findElement(By.name("q"));

        //Enter "apple"
        searchBox.sendKeys("apple");

        //4- Press ENTER to search
        searchBox.sendKeys(Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }
        else{
            System.out.println("Title verification FAILED!");
        }



    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */