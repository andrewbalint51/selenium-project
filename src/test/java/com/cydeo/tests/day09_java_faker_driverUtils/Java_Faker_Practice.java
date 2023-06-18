package com.cydeo.tests.day09_java_faker_driverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Java_Faker_Practice {

    @Test
    public void test1(){
        Faker faker = new Faker();

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.zelda().character() = " + faker.zelda().character());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"3##-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.muhtar().fact() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Muhtar"));
    }
}
