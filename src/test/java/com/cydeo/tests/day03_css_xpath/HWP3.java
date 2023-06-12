package com.cydeo.tests.day03_css_xpath;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.openChrome();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        //Find element
        WebElement gmailButton = driver.findElement(By.xpath("//a[@data-pid='23']"));
        gmailButton.click();

        //Verify title
        String expectedTitlePiece = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitlePiece)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        //5- Go back to Google by using the .back();

        driver.navigate().back();

        //6- Verify title equals:


        expectedTitlePiece = "Google";
        actualTitle = driver.getTitle();

        if(expectedTitlePiece.equals(actualTitle)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.close();

    }

    /*
    TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
     */
}
