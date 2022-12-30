/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the RomanNumeral class.
 * @author Alonso del Arte
 */
public class RomanNumeralTest {
    
    private static final Random RANDOM = new Random();
    
    @Test
    public void testToStringOneTwoThree() {
        assertEquals("I", new RomanNumeral(1).toString());
        assertEquals("II", new RomanNumeral(2).toString());
        assertEquals("III", new RomanNumeral(3).toString());
    }
    
    @Test
    public void testToStringFour() {
        assertEquals("IV", new RomanNumeral(4).toString());
    }
            
    @Test
    public void testToStringFive() {
        assertEquals("V", new RomanNumeral(5).toString());
    }
            
    @Test
    public void testToStringSixSevenEight() {
        assertEquals("VI", new RomanNumeral(6).toString());
        assertEquals("VII", new RomanNumeral(7).toString());
        assertEquals("VIII", new RomanNumeral(8).toString());
    }
            
    @Test
    public void testToStringNine() {
        assertEquals("IX", new RomanNumeral(9).toString());
    }
            
    @Test
    public void testToStringTen() {
        assertEquals("X", new RomanNumeral(10).toString());
    }
    
    @Test
    public void testToStringElevenToNineteen() {
        RomanNumeral ten = new RomanNumeral(10);
        for (int i = 1; i < 10; i++) {
            RomanNumeral number = new RomanNumeral(10 + i);
            RomanNumeral addend = new RomanNumeral(i);
            String expected = ten.toString() + addend.toString();
            String actual = number.toString();
            assertEquals(expected, actual);
        }
    }
    
    // TODO: Write tests 20 to MAXIMUM_NUMBER
    
    @Test
    public void testConstructorRejectsZero() {
        int invalidNumber = 0;
        try {
            RomanNumeral badNumeral = new RomanNumeral(invalidNumber);
            String msg = "Trying to instantiate RomanNumeral with " 
                    + invalidNumber + " should not have created " 
                    + badNumeral.toString();
            fail(msg);
        } catch (IllegalArgumentException iae) {
            System.out.println("Trying to instantiate RomanNumeral with " 
                    + invalidNumber 
                    + " correctly caused IllegalArgumentException");
            System.out.println("\"" + iae.getMessage() + "\"");
        } catch (RuntimeException re) {
            String msg = re.getClass().getName() 
                    + " is the wrong exception to throw for bad number " 
                    + invalidNumber;
            fail(msg);
        }
    }
    
    @Test
    public void testConstructorRejectsNegativeNumber() {
        int invalidNumber = -RANDOM.nextInt(4000) - 1;
        try {
            RomanNumeral badNumeral = new RomanNumeral(invalidNumber);
            String msg = "Trying to instantiate RomanNumeral with " 
                    + invalidNumber + " should not have created " 
                    + badNumeral.toString();
            fail(msg);
        } catch (IllegalArgumentException iae) {
            System.out.println("Trying to instantiate RomanNumeral with " 
                    + invalidNumber 
                    + " correctly caused IllegalArgumentException");
            System.out.println("\"" + iae.getMessage() + "\"");
        } catch (RuntimeException re) {
            String msg = re.getClass().getName() 
                    + " is the wrong exception to throw for bad number " 
                    + invalidNumber;
            fail(msg);
        }
    }
    
    // TODO: Write test for constructor rejects n > MAXIMUM_NUMBER
    
}
