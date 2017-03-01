package com.codeclan.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 01/03/2017.
 */

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void testAdd(){
        assertEquals(4, Calculator.add(1,3));
    }

    @Test
    public void testSubtract(){
        assertEquals(10, Calculator.subtract(20, 10));
    }

    @Test
    public void testMultiply(){
        assertEquals(144, Calculator.multiply(12,12));
    }

    @Test
    public void testDivide(){
        assertEquals(10, Calculator.divide(100,10));
    }
}


