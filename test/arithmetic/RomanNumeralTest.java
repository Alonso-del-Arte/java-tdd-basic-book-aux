/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alonso del Arte
 */
public class RomanNumeralTest {
    
    @Test
    public void testToStringOneTwoThree() {
        assertEquals("I", new RomanNumeral(1).toString());
        assertEquals("II", new RomanNumeral(2).toString());
        assertEquals("III", new RomanNumeral(3).toString());
    }
    
}
