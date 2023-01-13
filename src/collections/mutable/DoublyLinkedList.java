/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

/**
 * EXERCISE: Create a doubly-linked list. A stub is provided for a nested static 
 * class.
 * @param <E> The type of elements the list will hold.
 * @author Alonso del Arte
 */
public class DoublyLinkedList<E> {
    
    private boolean hasElements = false;
    
    private E mostRecentlyAdded;
    
    private Node<E> start = null;
    
    private Node<E> finish = null;
    
    public void addAtBeginning(E element) {
        if (element == null) {
            String excMsg = "Can't add null at beginning nor end of list";
            throw new NullPointerException(excMsg);
        }
        this.mostRecentlyAdded = element;
        this.hasElements = true;
    }
    
    public void addAtEnd(E element) {
        if (element == null) {
            String excMsg = "Can't add null at beginning nor end of list";
            throw new NullPointerException(excMsg);
        }
        this.mostRecentlyAdded = element;
        this.hasElements = true;
    }
    
    // TODO: Write tests for this
    public E get(int index) {
        return null;
    }
    
    public E getFirst() {
        return this.mostRecentlyAdded;
    }
    
    public E getLast() {
        return this.mostRecentlyAdded;
    }
    
    // TODO: Write tests for this
    public int size() {
        return Integer.MIN_VALUE;
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
    public int lastIndexOf(E element) {
        return Integer.MIN_VALUE;
    }
    
    public boolean isEmpty() {
        return !this.hasElements;
    }
    
    public void clear() {
        // TODO: Write tests for this
    }
    
    public DoublyLinkedList() {
        //
    }
    
    private static class Node<E> {
        
        final E elem;
        
        Node<E> previous = null;
        
        Node<E> next = null;
        
        Node(E element) {
            this.elem = element;
        }
        
    }
    
}
