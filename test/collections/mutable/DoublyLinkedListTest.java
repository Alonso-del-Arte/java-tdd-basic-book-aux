/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

import arithmetic.ComplexNumber;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Random;

import javax.management.AttributeValueExp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alonso del Arte
 */
public class DoublyLinkedListTest {
    
    @Test
    public void testAddAtBeginningRejectsNull() {
        DoublyLinkedList<AttributeValueExp> list = new DoublyLinkedList<>();
        try {
            list.addAtBeginning(null);
            String msg = "Should not have been able to add null at beginning";
            fail(msg);
        } catch (NullPointerException npe) {
            System.out.println("Trying to add null at beginning caused NPE");
            System.out.println("\"" + npe.getMessage() + "\"");
        } catch (RuntimeException re) {
            String msg = re.getClass().getName() 
                    + " is the wrong exception for adding null at beginning";
            fail(msg);
        }
    }
    
    @Test
    public void testAddEndRejectsNull() {
        DoublyLinkedList<AttributeValueExp> list = new DoublyLinkedList<>();
        try {
            list.addAtEnd(null);
            String msg = "Should not have been able to add null at end";
            fail(msg);
        } catch (NullPointerException npe) {
            System.out.println("Trying to add null at end caused NPE");
            System.out.println("\"" + npe.getMessage() + "\"");
        } catch (RuntimeException re) {
            String msg = re.getClass().getName() 
                    + " is the wrong exception for adding null at end";
            fail(msg);
        }
    }
    
    /**
     * Test of the isEmpty function, of the DoublyLinkedList class.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoublyLinkedList<AttributeValueExp> list = new DoublyLinkedList<>();
        boolean opResult = list.isEmpty();
        String msg = "Newly created list with no elements should be empty";
        assert opResult : msg;
    }

    /**
     * Test of addAtBeginning method, of class DoublyLinkedList.
     */
//    @Test
    public void testAddAtBeginning() {
        System.out.println("addAtBeginning");
        Object element = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addAtBeginning(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAtEnd method, of class DoublyLinkedList.
     */
//    @Test
    public void testAddAtEnd() {
        System.out.println("addAtEnd");
        Object element = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addAtEnd(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class DoublyLinkedList.
     */
//    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class DoublyLinkedList.
     */
//    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class DoublyLinkedList.
     */
//    @Test
    public void testGetLast() {
        System.out.println("getLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class DoublyLinkedList.
     */
//    @Test
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class DoublyLinkedList.
     */
//    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class DoublyLinkedList.
     */
//    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DoublyLinkedList.
     */
//    @Test
    public void testClear() {
        System.out.println("clear");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
