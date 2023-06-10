package com.cydeo.tests.day03_css_xpath;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");



        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedText = "Log In";
        String actualText = loginButton.getAttribute("value");

        if(actualText.equals(expectedText)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.close();

    }

    /*
    TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
     */
}
