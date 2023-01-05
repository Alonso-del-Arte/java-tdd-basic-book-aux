/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alonso del Arte
 */
public class ArrayBackedListTest {
    
    public ArrayBackedListTest() {
    }

    /**
     * Test of add method, of class ArrayBackedList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object element = null;
        ArrayBackedList instance = new ArrayBackedList();
        boolean expResult = false;
        boolean result = instance.add(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ArrayBackedList.
     */
    @Test
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
     * Test of size method, of class ArrayBackedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayBackedList instance = new ArrayBackedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ArrayBackedList.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayBackedList instance = new ArrayBackedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
