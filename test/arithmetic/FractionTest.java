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
 * Tests of the Fraction class.
 * @author Alonso del Arte
 */
public class FractionTest {
    
    private static final Random RANDOM = new Random();
    
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        int expected = RANDOM.nextInt(524288) + 1;
        int denom = 2 * expected + 1;
        Fraction fraction = new Fraction(expected, denom);
        long actual = fraction.getNumerator();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        int numer = RANDOM.nextInt(524288) + 1;
        int expected = 2 * numer + 1;
        Fraction fraction = new Fraction(numer, expected);
        long actual = fraction.getDenominator();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        int numer = RANDOM.nextInt(524288) + 1;
        int denom = 3 * numer + 1;
        Fraction fraction = new Fraction(numer, denom);
        String expected = numer + "/" + denom;
        String actual = fraction.toString().replace(" ", "");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToHTMLString() {
        System.out.println("toHTMLString");
        int numer = RANDOM.nextInt(524288) + 1;
        int denom = 4 * numer + 1;
        Fraction fraction = new Fraction(numer, denom);
        String expected = "<sup>" + numer + "</sup>&frasl;<sub>" + denom 
                + "</sub>";
        String actual = fraction.toHTMLString().replace(" ", "");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToTeXString() {
        System.out.println("toTeXString");
        int numer = RANDOM.nextInt(524288) + 1;
        int denom = 5 * numer + 1;
        Fraction fraction = new Fraction(numer, denom);
        String expected = "\\frac{" + numer + "}{" + denom + "}";
        String actual = fraction.toTeXString().replace(" ", "");
        assertEquals(expected, actual);
    }
    
    // TODO: Write test for adding up fractions with same denominator, 
    // preferably prime, e.g., 20/199 + 32/199
    
    // TODO: Write test for adding up fractions with different denominators, 
    // e.g., 7/12 + 8/13.
    
    // TODO: Write tests for all the other functions in the Fraction class
    
}
