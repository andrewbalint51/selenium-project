package com.cydeo.tests.day09_java_faker_driverUtils;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if(word==null){
            System.out.println("First time call word object is null");
            System.out.println("Assigning value");
            word = "something";
        }
        else{
            System.out.println("Word already has a value");
        }

        return word;
    }
}
