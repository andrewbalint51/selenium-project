package com.cydeo.tests.day12_review;

import com.cydeo.pages.W3SchoolsTryIt;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    /*
    TC #1: Double Click Test
1. Go to
https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
ck2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.
NOTE: FOLLOW POM
     */

    @Test
    public void TC1(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli\n" +
                "ck2");

        Driver.getDriver().switchTo().frame("iframeResult");

        Actions actions = new Actions(Driver.getDriver());

        W3SchoolsTryIt page = new W3SchoolsTryIt();

        actions.doubleClick(page.paragraph).perform();

        Assert.assertTrue(page.paragraph.getAttribute("style").contains("red"));

    }
}
