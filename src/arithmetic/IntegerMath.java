/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 * EXERCISE: Utility class with functions specifically for integer arithmetic. 
 * If you do this exercise, be sure to add an author Javadoc tag for yourself.
 * @author Alonso del Arte
 */
public class IntegerMath {
    
    // TODO: Write tests for this
    public static long euclideanGCD(long a, long b) {
        return Integer.MIN_VALUE;
    }
    
    public static int greatestOddDivisor(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n;
    }

}
