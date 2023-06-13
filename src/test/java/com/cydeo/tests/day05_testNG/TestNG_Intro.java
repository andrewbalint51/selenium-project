package com.cydeo.tests.day05_testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("Setup method is running");
    }


    @Test (priority = 1)
    public void test1(){
        System.out.println("test1 is running");
        Assert.assertEquals("apple", "apple");
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("test2 is running");
        String expected ="white";
        String actual = "white";
        Assert.assertTrue(expected.equals(actual));
    }
}
