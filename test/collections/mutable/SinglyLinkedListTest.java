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
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
    }

    /**
     * Test of add method, of class SinglyLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean expResult = false;
        boolean result = instance.add(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAtBeginning method, of class SinglyLinkedList.
     */
    @Test
    public void testAddAtBeginning() {
        System.out.println("addAtBeginning");
        Object element = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addAtBeginning(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAtEnd method, of class SinglyLinkedList.
     */
    @Test
    public void testAddAtEnd() {
        System.out.println("addAtEnd");
        Object element = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addAtEnd(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SinglyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class SinglyLinkedList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SinglyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contain method, of class SinglyLinkedList.
     */
    @Test
    public void testContain() {
        System.out.println("contain");
        Object element = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean expResult = false;
        boolean result = instance.contain(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class SinglyLinkedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SinglyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SinglyLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
