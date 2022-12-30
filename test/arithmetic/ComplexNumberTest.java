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
    
    @Test
    public void testToString() {
        System.out.println("toString");
        double re = Math.random() - 0.5;
        double im = Math.random() - 0.5;
        ComplexNumber z = new ComplexNumber(re, im);
        String middleSign = im < 0.0 ? "-" : "+";
        String expected = re + middleSign + im + "i";
        String actual = z.toString().replace(" ", "");
        assertEquals(expected, actual);
    }
    
}
