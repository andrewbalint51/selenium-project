package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropCircles {


    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
    /*
    TC2 #: Drag and drop default value verification
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Verify big circle default text is as below.
3. Assert:
-Text in big circle changed to: “Drag the small circle here.”
*/

    @Test
    public void TC2(){
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        String expected = "Drag the small circle here.";

        Assert.assertTrue(bigCircle.getText().equals(expected));
    }

    @Test
    public void TC3(){

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));


        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(smallCircle, bigCircle).perform();

        String expected = "You did great!";

        Assert.assertTrue(bigCircle.getText().equals(expected));



    }

/*
TC3 #: Drag and drop into the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”

*/
    /*

TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Click and hold the small circle.
3. Assert:
-
    Text in big circle changed to: “Drop here.”
    */

    @Test
    public void TC4(){
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).moveToElement(cydeoLink).perform();

        String expected = "Drop here.";

        Assert.assertTrue(bigCircle.getText().equals(expected));


    }

    /*


TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”*/

    @Test
    public void TC5(){
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).moveToElement(cydeoLink).release().perform();

        String expected = "Try again!";

        Assert.assertTrue(bigCircle.getText().equals(expected));


    }

/*TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify.
3. Assert:
-
    Text in big circle changed to: “Now drop...”
     */

    @Test
    public void TC6(){
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).moveToElement(bigCircle).perform();

        String expected = "Now drop...";

        Assert.assertTrue(bigCircle.getText().equals(expected));


    }
}
