package com.cydeo.tests.day03_css_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1 {
    public static void main(String[] args) {


            //Open Chrome
            WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.get("https://www.etsy.com");

            WebElement searchBar = driver.findElement(By.cssSelector("input[data-id='search-query']"));

            //search for wooden spoon
            searchBar.sendKeys("wooden spoon");
            searchBar.sendKeys(Keys.ENTER);

            String expectedTitle = "Wooden spoon - Etsy";
            String actualTitle = driver.getTitle();

            if(expectedTitle.equals(actualTitle)){
                System.out.println("PASSED");
            }
            else{
                System.out.println("FAILED");
            }

            driver.close();




    }
    /*
    HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
     */
}
