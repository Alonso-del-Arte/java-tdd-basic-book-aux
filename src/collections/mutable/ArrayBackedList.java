/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

/**
 *
 * @param <E>
 * @author Alonso del Arte
 */
public class ArrayBackedList<E> {
    
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    
    private Object[] elements;
    
    // TODO: Write tests for this
    public boolean add(E element) {
        return false;
    }
    
    // TODO: Write tests for this
    public boolean add(int index, E element) {
        return false;
    }
    
    // TODO: Write tests for this
    public int size() {
        return Integer.MIN_VALUE;
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
