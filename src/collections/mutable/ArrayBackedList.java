/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

/**
 * EXERCISE: A re-imagining of <code>java.util.ArrayList&lt;E&gt;</code>. For 
 * this exercise, pretend that <code>ArrayList&lt;E&gt;</code> does not exist. 
 * But, if you get stuck, refer to that class.
 * @param <E> The type that the list will hold. For example, 
 * <code>java.time.LocalDateTime</code>.
 * @author Alonso del Arte
 */
public class ArrayBackedList<E> {
    
    public static final int DEFAULT_INITIAL_CAPACITY = 10;
    
    private Object[] elements;
    
    private int count = 0;
    
    private void expandCapacity() {
        //
    }
    
    public boolean add(E element) {
        this.count++;
        return true;
    }
    
    // TODO: Write tests for this
    public boolean add(int index, E element) {
        return false;
    }
    
    public int size() {
        return this.count;
    }
    
    // TODO: Write tests for this
    public E get(int index) {
        return null;
    }
    
    // TODO: Write tests for this
    public boolean contain(E element) {
        return false;
    }
    
    // TODO: Write tests for this
    public int indexOf(E element) {
        return Integer.MAX_VALUE;
    }
    
    // TODO: Write tests for this
    public boolean isEmpty() {
        return false;
    }
    
    public void clear() {
        // TODO: Write tests for this
    }
    
    public ArrayBackedList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }
    
    public ArrayBackedList(int initialCapacity) {
        //
    }
    
}