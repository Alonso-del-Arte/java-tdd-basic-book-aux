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

import javax.smartcardio.CardTerminal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the ArrayBackedList&lt;E&gt; class.
 * @author Alonso del Arte
 */
public class ArrayBackedListTest {
    
    private static final Random RANDOM = new Random();
    
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
    
    @Test
    public void testCanAddBeyondInitialCapacity() {
        LocalDateTime curr = LocalDateTime.now();
        ArrayBackedList<LocalDateTime> list 
                = new ArrayBackedList<>(ArrayBackedList
                        .DEFAULT_INITIAL_CAPACITY);
        for (int i = 0; i < ArrayBackedList.DEFAULT_INITIAL_CAPACITY; i++) {
            curr = curr.plusHours(i);
            list.add(curr);
        }
        curr = curr.plusDays(1);
        try {
            list.add(curr);
            System.out.println("Successfully added one more element " 
                    + curr.toString() + " beyond initial capacity " 
                    + ArrayBackedList.DEFAULT_INITIAL_CAPACITY);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("\"" + aioobe.getMessage() + "\"");
            String msg = "Trying to add one more element " + curr.toString() 
                    + " beyond initial capacity " 
                    + ArrayBackedList.DEFAULT_INITIAL_CAPACITY 
                    + " should not have caused ArrayIndexOutOfBoundsException";
            fail(msg);
        } catch (RuntimeException re) {
            String msg = re.getClass().getName() 
                    + " should not have occurred, list should have expanded";
            fail(msg);
        }
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
     * Test of the get function, of the ArrayBackedList class.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        ArrayBackedList<BigInteger> list = new ArrayBackedList<>();
        for (int i = 0; i < ArrayBackedList.DEFAULT_INITIAL_CAPACITY; i++) {
            BigInteger expected = new BigInteger(64 + i, RANDOM);
            list.add(expected);
            BigInteger actual = list.get(i);
            assertEquals(expected, actual);
        }
    }
    
    @Test
    public void testAddAtLastIndex() {
        ArrayBackedList<BigInteger> list = new ArrayBackedList<>();
        for (int i = 0; i < ArrayBackedList.DEFAULT_INITIAL_CAPACITY; i++) {
            list.add(new BigInteger(64 + i, RANDOM));
        }
        BigInteger expected = new BigInteger(84, RANDOM);
        boolean opResult = list.add(ArrayBackedList.DEFAULT_INITIAL_CAPACITY, 
                expected);
        String msg = "Should have been able to add " + expected.toString() 
                + " at index " + ArrayBackedList.DEFAULT_INITIAL_CAPACITY;
        assert opResult : msg;
        BigInteger actual = list.get(ArrayBackedList.DEFAULT_INITIAL_CAPACITY);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddAtIndexRejectsNull() {
        ArrayBackedList<BigInteger> list = new ArrayBackedList<>();
        for (int i = 0; i < ArrayBackedList.DEFAULT_INITIAL_CAPACITY; i++) {
            list.add(new BigInteger(64 + i, RANDOM));
        }
        int index = RANDOM.nextInt(ArrayBackedList.DEFAULT_INITIAL_CAPACITY);
        boolean opResult = list.add(index, null);
        String msg = "Should not have been able to add null at index " + index;
        assert !opResult : msg;
    }
    
    @Test
    public void testAddAtIndex() {
        int capacity = RANDOM.nextInt(ArrayBackedList.DEFAULT_INITIAL_CAPACITY) 
                + ArrayBackedList.DEFAULT_INITIAL_CAPACITY;
        byte[] expecteds = new byte[capacity];
        RANDOM.nextBytes(expecteds);
        int skipIndex = RANDOM.nextInt(capacity);
        ArrayBackedList<Byte> list = new ArrayBackedList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            if (i != skipIndex) {
                list.add(expecteds[i]);
            }
        }
        list.add(skipIndex, expecteds[skipIndex]);
        byte[] actuals = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            actuals[i] = list.get(i);
        }
        assertArrayEquals(expecteds, actuals);
    }
    
    @Test
    public void testReferentialEquality() {
        ArrayBackedList<CardTerminal> list = new ArrayBackedList<>();
        assertEquals(list, list);
    }
    
    @Test
    public void testNotEqualsNull() {
        ArrayBackedList<CardTerminal> list = new ArrayBackedList<>();
        assertNotEquals(list, null);
    }
    
    @Test
    public void testNotEqualsDiffClass() {
        String element = "This is an element of a list";
        ArrayBackedList<String> list = new ArrayBackedList<>();
        list.add(element);
        assertNotEquals(list, element);
    }
    
    @Test
    public void testNotEqualsDiffSizeList() {
        int capacity = RANDOM.nextInt(16) + 4;
        ArrayBackedList<Integer> listA = new ArrayBackedList<>(capacity);
        ArrayBackedList<Integer> listB = new ArrayBackedList<>(capacity + 1);
        for (int i = 0; i < capacity; i++) {
            listA.add(i);
            listB.add(i);
        }
        listB.add(capacity);
        String msg = "List A with " + listA.size() 
                + " elements should not be equal to list B with " + listB.size() 
                + " elements";
        assertNotEquals(msg, listA, listB);
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        int capacity = RANDOM.nextInt(16) + 4;
        ArrayBackedList<BigInteger> someList = new ArrayBackedList<>(capacity);
        ArrayBackedList<BigInteger> sameList = new ArrayBackedList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            BigInteger number = new BigInteger(64 + i, RANDOM);
            someList.add(number);
            sameList.add(number);
        }
        assertEquals(someList, sameList);
    }

    /**
     * Test of contains method, of class ArrayBackedList.
     */
//    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        ArrayBackedList instance = new ArrayBackedList();
        boolean expResult = false;
        boolean result = instance.contains(element);
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
