package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollUsingJavaScript {

    /*
    TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only
JavaScript method to use : arguments[0].scrollIntoView(true)
Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
     */

    @Test
    public  void TC7(){
        Driver.getDriver().get("https://practice.cydeo.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        WebElement table = Driver.getDriver().findElement(By.xpath("//table[@id='large-table']"));


        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", table, homeLink);

        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", table, homeLink);

    }
}
