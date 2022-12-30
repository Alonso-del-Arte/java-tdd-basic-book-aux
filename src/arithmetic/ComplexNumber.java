/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 * EXERCISE: A class to represent complex numbers like &minus;0.5 + 
 * 14.134725141734695. Look in the corresponding test class for hints on how to 
 * do this exercise.
 * @author Alonso del Arte
 */
public class ComplexNumber {
    
    private final double realPart, imagPart;
    
    public double getRealPart() {
        return Double.POSITIVE_INFINITY;
    }
    
    public double getImaginaryPart() {
        return Double.NEGATIVE_INFINITY;
    }
    
    public double abs() {
        return Double.NaN;
    }
    
    public double angle() {
        return Double.NaN;
    }
    
    public ComplexNumber(double re, double im) {
        this.realPart = re;
        this.imagPart = im;
    }
    
}
