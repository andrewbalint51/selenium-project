package com.cydeo.tests.day10_JSExecutor;

import com.cydeo.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_UploadTask {
    /*
    TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
     */

    @Test
    public void TC2(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        WebElement upload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        upload.sendKeys("/Users/andrewbalint51/Desktop/file.txt");

        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();

        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@id='uploaded-files']"));

        Assert.assertTrue(successMessage.isDisplayed());

        Driver.closeDriver();


    }


}
