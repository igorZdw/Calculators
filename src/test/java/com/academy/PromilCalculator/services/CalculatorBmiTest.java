package com.academy.PromilCalculator.services;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorBmiTest {
    private static CalculatorBmi calculatorBmi;


    @BeforeClass
    public static void start(){
        calculatorBmi = new CalculatorBmi();
    }

    @AfterClass
    public static void stop(){
        calculatorBmi = null;
    }

    @Test
    public void BmiOperation()
    {
        assertNotEquals(21.23,calculatorBmi.calculate(1.75,70),0.2);
        assertEquals(22.86,calculatorBmi.calculate(1.75,70),0.2);
    }
}
