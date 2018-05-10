/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class NumberValidationTest {
    
    public NumberValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of text result when multiple of 3.
     */
    @Test
    public void testTextResultMultipleOfThree() {
        System.out.println("textResultMultipleOfThree");
        NumberValidation instance = new NumberValidation();
        String expResult = "Fizz";
        String result = instance.validateNumber(27);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of text result when multiple of 5.
     */
    @Test
    public void testTextResultMultipleOfFive() {
        System.out.println("textResultMultipleOfFive");
        NumberValidation instance = new NumberValidation();
        String expResult = "Buzz";
        String result = instance.validateNumber(35);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of text result when multiple of both three and five .
     */
    @Test
    public void testTextResultMultipleOfThreeAndFive() {
        System.out.println("textResultMultipleOfThreeAndFive");
        NumberValidation instance = new NumberValidation();
        String expResult = "FizzBuzz";
        String result = instance.validateNumber(15);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of text result when is not multiple of three or five.
     */
    @Test
    public void testTextResultNotMultipleOfThreeAndFive() {
        System.out.println("textResultNotMultipleOfThreeAndFive");
        NumberValidation instance = new NumberValidation();
        String expResult = "13";
        String result = instance.validateNumber(13);
        assertEquals(expResult, result);
    }

   
    /**
     * Test of multiple of three numbers.
     */
    @Test
    public void testIsMultipleOfThree() {
        System.out.println("isMultipleOfThree");
        Integer number = 33;
        NumberValidation instance = new NumberValidation();        
        boolean result = instance.isMultipleOfThree(number);
        assertTrue(result);
    }
    
    /**
     * Test of not multiple of three numbers.
     */
    @Test
    public void testIsNotMultipleOfThree() {
        System.out.println("isNotMultipleOfThree");
        Integer number = 8;
        NumberValidation instance = new NumberValidation();        
        boolean result = instance.isMultipleOfThree(number);
        assertFalse(result);
    }

    /**
     * Test of multiple of five numbers
     */
    @Test
    public void testIsMultipleOfFive() {
        System.out.println("isMultipleOfFive");
        Integer number = 25;
        NumberValidation instance = new NumberValidation();
        
        boolean result = instance.isMultipleOfFive(number);
        assertTrue(result);
    }
    
    /**
     * Test of not multiple of five numbers
     */
    @Test
    public void testIsNotMultipleOfFive() {
        System.out.println("isNotMultipleOfFive");
        Integer number = 27;
        NumberValidation instance = new NumberValidation();
        
        boolean result = instance.isMultipleOfFive(number);
        assertFalse(result);
    }

    /**
     * Test of multiple of three text
     */
    @Test
    public void testGetMultipleOfThreeMessage() {
        System.out.println("getMultipleOfThreeMessage");
        NumberValidation instance = new NumberValidation();
        String expResult = "Fizz";
        String result = instance.getMultipleOfThreeMessage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test multiple of five text
     */
    @Test
    public void testGetMultipleOfFiveMessage() {
        System.out.println("getMultipleOfFiveMessage");
        NumberValidation instance = new NumberValidation();
        String expResult = "Buzz";
        String result = instance.getMultipleOfFiveMessage();
        assertEquals(expResult, result);        
        
    }
    
}
