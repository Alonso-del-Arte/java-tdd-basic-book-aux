/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

import arithmetic.ComplexNumber;

import java.time.LocalDateTime;

import javax.smartcardio.CardTerminal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the ArrayBackedList&lt;E&gt; class.
 * @author Alonso del Arte
 */
public class ArrayBackedListTest {
    
    @Test
    public void testAddRejectsNull() {
        ArrayBackedList<CardTerminal> list = new ArrayBackedList<>();
        boolean opResult = list.add(null);
        String msg = "Should not have been able to add null to list";
        assert !opResult : msg;
    }
    
    /**
     * Test of the add function, of the ArrayBackedList class.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        LocalDateTime time = LocalDateTime.now();
        ArrayBackedList<LocalDateTime> list = new ArrayBackedList<>();
        boolean opResult = list.add(time);
        String msg = "Should be able to add " + time.toString() 
                + " to list of times";
        assert opResult : msg;
    }

    /**
     * Test of the size function, of the ArrayBackedList class.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayBackedList<ComplexNumber> list = new ArrayBackedList<>();
        for (int expected = 0; 
                expected < ArrayBackedList.DEFAULT_INITIAL_CAPACITY; 
                expected++) {
            int actual = list.size();
            assertEquals(expected, actual);
            ComplexNumber number = new ComplexNumber(expected * Math.random(), 
                    expected * Math.random());
            list.add(number);
        }
    }

    /**
     * Test of add method, of class ArrayBackedList.
     */
//    @Test
    public void testAdd_int_GenericType() {
        System.out.println("add");
        int index = 0;
        Object element = null;
        ArrayBackedList instance = new ArrayBackedList();
        boolean expResult = false;
        boolean result = instance.add(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ArrayBackedList.
     */
//    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        ArrayBackedList instance = new ArrayBackedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contain method, of class ArrayBackedList.
     */
//    @Test
    public void testContain() {
        System.out.println("contain");
        Object element = null;
        ArrayBackedList instance = new ArrayBackedList();
        boolean expResult = false;
        boolean result = instance.contain(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class ArrayBackedList.
     */
//    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = null;
        ArrayBackedList instance = new ArrayBackedList();
        int expResult = 0;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ArrayBackedList.
     */
//    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayBackedList instance = new ArrayBackedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ArrayBackedList.
     */
//    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayBackedList instance = new ArrayBackedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
