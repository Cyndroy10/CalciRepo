package com.cg;

import java.util.Scanner;

import com.cg.bean.Calculator;

/**
 * Hello world!
 *
 */
public class CalculatorDemo 
{
    public static void main( String[] args )
    {
    	try (Scanner s = new Scanner(System.in)){
    		System.out.println( "Calculator" );
    		System.out.println( "Enter numbers to be added:" );
    		int a = s.nextInt();
    		int b = s.nextInt();
    		Calculator c  = new Calculator();
    		System.out.println("Sum = "+c.add(a, b));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
