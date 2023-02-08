/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the DayOfTheWeek class.
 * @author Alonso del Arte
 */
public class DayOfTheWeekTest {
    
    @Test
    public void testGetISO8601Value() {
        System.out.println("getISO8601Value()");
        assertEquals(1, DayOfTheWeek.MONDAY.getISO8601Value());
        assertEquals(2, DayOfTheWeek.TUESDAY.getISO8601Value());
        assertEquals(3, DayOfTheWeek.WEDNESDAY.getISO8601Value());
        assertEquals(4, DayOfTheWeek.THURSDAY.getISO8601Value());
        assertEquals(5, DayOfTheWeek.FRIDAY.getISO8601Value());
        assertEquals(6, DayOfTheWeek.SATURDAY.getISO8601Value());
        assertEquals(7, DayOfTheWeek.SUNDAY.getISO8601Value());
    }
    
}
