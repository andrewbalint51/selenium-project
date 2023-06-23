package com.cydeo.tests.day10_JSExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC6_JavascriptExecutor {

    /*
    TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a. 750 pixels down 10 times.
b. 750 pixels up 10 times
JavaScript method to use : window.scrollBy(0,0)
     */


    @Test
    public void TC6(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for(int i =0; i<10;i++) {


            js.executeScript("window.scrollBy(0,750)");

            BrowserUtils.sleep(1);

        }

        for(int i =0; i<10;i++) {


            js.executeScript("window.scrollBy(0,-75)");

            BrowserUtils.sleep(1);

        }

        Driver.closeDriver();
    }
}
