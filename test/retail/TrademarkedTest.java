/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retail;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrademarkedTest {
    
    @Test
    public void testMarkWithASCII() {
        System.out.println("markWithASCII");
        Trademarked instance = new TrademarkedImpl();
        String expected = instance.mark() + "(TM)";
        String actual = instance.markWithASCII();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMarkWithHTML() {
        System.out.println("markWithHTML");
        Trademarked instance = new TrademarkedImpl();
        String expected = instance.mark() + "&trade;";
        String actual = instance.markWithHTML();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMarkWithUnicode() {
        System.out.println("markWithUnicode");
        Trademarked instance = new TrademarkedImpl();
        String expected = instance.mark() + '\u2122';
        String actual = instance.markWithUnicode();
        assertEquals(expected, actual);
    }
    
    private static class TrademarkedImpl implements Trademarked {
        
        @Override
        public String mark() {
            return "Examplatoreadore";
        }
    }
    
}
