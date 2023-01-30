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
public class ArrayBackedList<E> extends ArrayBackedCollection<E> {
    
    public static final int DEFAULT_INITIAL_CAPACITY = 10;
    
    private Object[] elements;
    
    private int count = 0;
    
    private void expandCapacity() {
        int oldCapacity = this.elements.length;
        int expandedCapacity = 3 * oldCapacity / 2;
        Object[] replacementArray = new Object[expandedCapacity];
        System.arraycopy(this.elements, 0, replacementArray, 0, oldCapacity);
        this.elements = replacementArray;
    }
    
    public boolean add(E element) {
        if (element == null) {
            return false;
        } else {
            if (this.count == this.elements.length) {
                this.expandCapacity();
            }
            this.elements[this.count] = element;
            this.count++;
            return true;
        }
    }
    
    private void moveElementsRight(int index) {
        if (this.elements.length == this.count) {
            this.expandCapacity();
        }
        for (int i = this.count; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.count++;
    }
    
    public boolean add(int index, E element) {
        if (element == null) {
            return false;
        }
        if (index == this.count) { 
            return this.add(element);
        } else {
            this.moveElementsRight(index);
            this.elements[index] = element;
            return true;
        }
    }
    
    public int size() {
        return this.count;
    }
    
    public E get(int index) {
        return (E) this.elements[index];
    }
    
    // TODO: Write tests for this
    public boolean contains(E element) {
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        final ArrayBackedList<?> other = (ArrayBackedList<?>) obj;
        if (this.count != other.count) {
            return false;
        }
        boolean matchesSoFar = true;
        int index = 0;
        while (matchesSoFar && index < this.count) {
            matchesSoFar = this.elements[index].equals(other.elements[index]);
            index++;
        }
        return matchesSoFar;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    public ArrayBackedList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }
    
    public ArrayBackedList(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }
    
}
