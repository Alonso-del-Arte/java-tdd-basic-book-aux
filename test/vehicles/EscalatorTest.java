/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import org.junit.Test;
import static org.junit.Assert.*;

public class EscalatorTest {
    
    @Test
    public void testMark() {
        System.out.println("mark");
        Escalator instance = new Escalator();
        String expected = "Escalator";
        String actual = instance.mark();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMarkWithASCII() {
        System.out.println("markWithASCII");
        Escalator instance = new Escalator();
        String expected = "Escalator(TM)";
        String actual = instance.markWithASCII();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMarkWithHTML() {
        System.out.println("markWithHTML");
        Escalator instance = new Escalator();
        String expected = "Escalator&trade;";
        String actual = instance.markWithHTML();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMarkWithUnicode() {
        System.out.println("markWithUnicode");
        Escalator instance = new Escalator();
        String expected = "Escalator\u2122";
        String actual = instance.markWithUnicode();
        assertEquals(expected, actual);
    }
    
}
