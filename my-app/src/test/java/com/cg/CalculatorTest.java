package com.cg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cg.bean.Calculator;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{

    @Test
    public void addTest()
    {
    	Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
        System.out.println("Test complete");
    }
}
