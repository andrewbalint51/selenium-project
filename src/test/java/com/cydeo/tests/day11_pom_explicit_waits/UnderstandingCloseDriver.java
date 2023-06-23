package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class UnderstandingCloseDriver {

    @Test
    public void TC1(){
        Driver.getDriver().get("https://www.google.com");
    }

    @Test
    public void TC2(){
        Driver.getDriver().get("https://www.google.com");
    }

    @Test
    public void TC3(){
        Driver.getDriver().get("https://www.google.com");
    }
}
