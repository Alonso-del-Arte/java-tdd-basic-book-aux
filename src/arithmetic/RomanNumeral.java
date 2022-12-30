/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 * EXERCISE: A class to display small positive integers as Roman numerals. If 
 * you choose to do this exercise, decide what is the maximum number that this 
 * class can represent.
 * @author Alonso del Arte
 */
public class RomanNumeral {
    
    /**
     * The minimum number that an instance of this class can hold. As you know, 
     * the ancient Romans had no concept of zero as a number, much less negative 
     * numbers.
     */
    public static final int MINIMUM_NUMBER = 1;
    
// TODO: Choose what MAXIMUM_NUMBER is. Suggestion: 3999    
// TODO: Write Javadoc explaining MAXIMUM_NUMBER
//    public static final int MAXIMUM_NUMBER = 3999;
    
    private final int number;
    
    @Override
    public String toString() {
        switch (this.number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
                // I suppose we could go one by one for 11 up to MAXIMUM_NUMBER, 
                // but that would be rather inefficient...
            default:
                return "NOT RECOGNIZED";
        }
    }
    
    public RomanNumeral(int n) {
        this.number = n;
    }
    
}
