package com.academy.PromilCalculator.services;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class CalculatorBmrTest {
        private static CalculatorBmr calculatorBmr;


        @BeforeClass
        public static void start(){
            calculatorBmr = new CalculatorBmr();
        }

        @AfterClass
        public static void stop(){
            calculatorBmr = null;
        }

        @Test
        public void BmrOperation()
        {
            assertNotEquals(2700,calculatorBmr.calculate(178,80,23),0.2);
            assertEquals(1896.52,calculatorBmr.calculate(178,80,23),0.2);
        }
}
