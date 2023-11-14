package org.example;

import org.example.mg.FizzBuzz.FizzBuzzGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    //TDD process:
    //Step 1 Red - Write a failing test
    //Step 2 Green - Write enough code to pass the test
    //Step 3 Refactor -All tests should pass

    @Test
    @DisplayName("Check that 3 returns fizz")
    void checkThat3ReturnsFizz(){
        Assertions.assertEquals("fizz", FizzBuzzGenerator.getValue(3));
    }

    @Test
    @DisplayName("Check that 5 returns buzz")
    void checkThat5ReturnsBuzz(){
        Assertions.assertEquals("buzz", FizzBuzzGenerator.getValue(5));
    }

}
