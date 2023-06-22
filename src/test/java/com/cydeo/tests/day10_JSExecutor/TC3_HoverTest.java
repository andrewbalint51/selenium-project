package com.cydeo.tests.day10_JSExecutor;

import com.cydeo.tests.Utilities.BrowserUtils;
import com.cydeo.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_HoverTest {

    /*
    TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed
     */

    @Test
    public void TC3(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement firstImage = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement firstMessage = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement secondMessage = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement thirdMessage = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions hover = new Actions(Driver.getDriver());

        hover.moveToElement(firstImage).perform();
        Assert.assertTrue(firstMessage.isDisplayed());

        BrowserUtils.sleep(2);

        hover.moveToElement(secondImage).perform();
        Assert.assertTrue(secondMessage.isDisplayed());

        BrowserUtils.sleep(2);

        hover.moveToElement(thirdImage).perform();
        Assert.assertTrue(thirdMessage.isDisplayed());

        BrowserUtils.sleep(2);

        Driver.closeDriver();
    }
}
