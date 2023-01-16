/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of IntegerMath class. Please allow a couple of seconds for these tests 
 * to run. But if that's too long, adjust the test with timeout.
 * @author Alonso del Arte
 */
public class IntegerMathTest {
    
    private static final Random RANDOM = new Random();

    /**
     * First test of the euclideanGCD function, of the IntegerMath class. If 
     * <i>a</i> is a positive integer, then gcd(<i>a</i>, <i>a</i>) = <i>a</i>.
     */
    @Test
    public void testEuclideanGCDSamePositive() {
        System.out.println("euclideanGCD");
        int expected = RANDOM.nextInt(262144) + 1;
        long actual = IntegerMath.euclideanGCD(expected, expected);
        assertEquals(expected, actual);
    }
    
    /**
     * Second test of the euclideanGCD function, of the IntegerMath class. If 
     * <i>a</i> is a positive integer, then gcd(&minus;<i>a</i>, 
     * &minus;<i>a</i>) = <i>a</i>.
     */
    // TODO: Activate this test once the first test passes
//    @Test
    public void testEuclideanGCDSameNegative() {
        int expected = RANDOM.nextInt(262144) + 1;
        long actual = IntegerMath.euclideanGCD(-expected, -expected);
        assertEquals(expected, actual);
    }
    
    // TODO: Write other tests for euclideanGCD
    
    /**
     * Test of the greatestOddDivisor function, of the IntegerMath class. Take a 
     * pseudorandom positive odd number less than 131072 and multiply it by some 
     * power of two by shifting it one to eight bits left. The function should 
     * find the original odd number.
     */
    @Test
    public void testGreatestOddDivisor() {
        System.out.println("greatestOddDivisor");
        int expected = 2 * RANDOM.nextInt(65536) + 1;
        int shift = RANDOM.nextInt(8) + 1;
        int n = expected << shift;
        int actual = IntegerMath.greatestOddDivisor(n);
        String msg = "Greatest odd divisor of " + n + " is " + expected;
        assertEquals(msg, expected, actual);
    }
    
    /**
     * Another test of the greatestOddDivisor function, of the IntegerMath 
     * class. Calling that function on 0 should not get the computer stuck on an 
     * endless loop of halving 0, so this test waits a full second before either 
     * getting a result or catching an exception.
     */
    @Test(timeout = 1000)
    public void testGreatestOddDivisorZeroDoesNotCauseEndlessLoop() {
        try {
            int result = IntegerMath.greatestOddDivisor(0);
            System.out.println("Greatest odd divisor of 0 is said to be " 
                    + result);
        } catch (RuntimeException re) {
            System.out.println("Greatest odd divisor of 0 caused " 
                    + re.getClass().getName());
            System.out.println("\"" + re.getMessage() + "\"");
        }
    }
    
}
