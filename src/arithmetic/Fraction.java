/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 * EXERCISE: A class to represent fractions like <sup>5</sup>&frasl;<sub>8</sub> 
 * and &minus;<sup>1</sup>&frasl;<sub>2</sub>. Look in the corresponding test 
 * class for hints on how to do this exercise.
 * <p>It is recommended that you do the {@link IntegerMath} exercise before this 
 * one, or at least {@link IntegerMath#euclideanGCD(long, long)}. If you do this
 * exercise, be sure to add an author Javadoc tag for yourself.</p>
 * @author Alonso del Arte
 */
public class Fraction {
    
    private final long numerator, denominator;
    
    // TODO: Write tests for this
    public long getNumerator() {
        return Long.MAX_VALUE;
    }
    
    // TODO: Write tests for this
    public long getDenominator() {
        return Long.MIN_VALUE;
    }
    
    // TODO: Write tests for this
    public Fraction plus(Fraction addend) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction plus(int addend) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction negate() {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction minus(Fraction subtrahend) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction minus(int subtrahend) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction times(Fraction multiplicand) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction times(int multiplicand) {
        return this;
    }
        
    // TODO: Write tests for this
    public Fraction reciprocal() {
        return this;
    }
        
    // TODO: Write tests for this
    public Fraction divides(Fraction divisor) {
        return this;
    }
    
    // TODO: Write tests for this
    public Fraction divides(int divisor) {
        return this;
    }
        
    // TODO: Write tests for this
    public double getNumericApproximation() {
        return Double.NaN;
    }
    
    // TODO: Write tests for this
    public String toHTMLString() {
        return "NOT IMPLEMENTED YET";
    }
    
    // TODO: Write tests for this
    public String toTeXString() {
        return "NOT IMPLEMENTED YET";
    }
    
    public Fraction(long numer, long denom) {
        this.numerator = numer;
        this.denominator = denom;
    }
    
}
