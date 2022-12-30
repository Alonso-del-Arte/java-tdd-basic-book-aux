/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the ComplexNumber class.
 * @author Alonso del Arte
 */
public class ComplexNumberTest {
    
    /**
     * Test of the toString function of the ComplexNumber class. The real part 
     * of the number should be followed by either a plus sign or a minus sign 
     * for the imaginary part, then the digits of the imaginary part followed by 
     * the letter i. Spaces are allowed but not required before and after the 
     * middle sign, and there may be a space before the i.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        double re = Math.random() - 0.5;
        double im = Math.random() - 0.5;
        ComplexNumber z = new ComplexNumber(re, im);
        String middleSign = im < 0.0 ? "-" : "+";
        String expected = re + middleSign + Math.abs(im) + "i";
        String actual = z.toString().replace(" ", "");
        assertEquals(expected, actual);
    }
    
    /**
     * Another test of the toString function of the ComplexNumber class. If the 
     * imaginary part of a complex number happens to be negative zero (one of 
     * the oddities of the IEEE-754 floating point number format), the number 
     * should be written with a plus sign or a minus sign between the real part 
     * and the imaginary part, but not both. For example, given real part 0.25, 
     * either "0.25 + 0.0i" or "0.25 - 0.0i would be valid, but "0.25 + -0.0i" 
     * would be invalid.
     */
    @Test
    public void testToStringNegativeZeroForImagPart() {
        double re = Math.random() - 0.5;
        double im = Double.longBitsToDouble(Long.MIN_VALUE);
        ComplexNumber z = new ComplexNumber(re, im);
        String expectedA = re + "+0.0i";
        String expectedB = re + "-0.0i";
        String actual = z.toString().replace(" ", "");
        String msg = "Number with real part " + re + " and imaginary part " + im 
                + " should be reported as either " + expectedA + " or " 
                + expectedB + ". Actual: " + actual;
        assert expectedA.equals(actual) || expectedB.equals(actual) : msg;
    }
    
    // TODO: Write test for abs(), the absolute value of a complex number
    // The absolute value of a complex number is its distance from zero.
    // Examples:
    // Absolute value of -1.0 + 0.0i is exactly  1.0
    // Absolute value of -1.0 - 3.2i is roughly  3.35261
    // Absolute value of  0.0 + 5.3i is exactly  5.3
    // Absolute value of 22.7 + 0.0i is exactly 22.7
    
    // TODO: Write test for angle()
    // The angle of a complex number
    // Examples:
    // Angle of -1.0 + 0.0i is roughly  3.14159  radians (exactly 180 degrees)
    // Angle of -1.0 - 3.2i is roughly -1.873681 radians
    // Angle of  0.0 + 5.3i is roughly  1.570796 radians (exactly  90 degrees)
    // Angle of 22.7 + 0.0i is exactly  0.0      radians or degrees
    
}
