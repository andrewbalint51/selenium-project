package com.cydeo.tests.day05_testNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class TC3_UtilityMethod {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        clickAndVerifyRadioButton(driver, "color", "yellow");

        driver.close();
    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String ID){

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='"+name+"']"));

        for (WebElement each : radioButtons) {
            if(each.getAttribute("id").equals(ID)){
                each.click();
                System.out.println(ID+" is selected: "+each.isSelected());
                break;
            }
        }

        //System.out.println("hockeyRadioButton.isSelected(), expecting true = " + hockeyRadioButton.isSelected());

    }

    /*
    TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
     */
}
