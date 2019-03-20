package com.academy.PromilCalculator.services;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class CalculatorTest {

    private static Calculator calculator;


    @BeforeClass
    public static void start(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void stop(){
        calculator = null;
    }

    @Test
    public void CalculatorOperation()
    {
        assertNotEquals(1.2,calculator.calculate(120,0.7,80),0.05);
        assertEquals(1.05,calculator.calculate(120,0.7,80),0.05);
    }

}
