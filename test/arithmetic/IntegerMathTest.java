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
 *
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
    
}
