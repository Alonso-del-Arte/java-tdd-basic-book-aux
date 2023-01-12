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
    
    // TODO: Determine if this applicable for the direction you choose
    private Node<E> start = null;
    
    // TODO: Determine if this applicable for the direction you choose
    private Node<E> finish = null;
    
    // TODO: Write tests for this
    public boolean add(E element) {
        return false;
    }
    
    // TODO: Determine if this applicable for the direction you choose
    public void addAtBeginning(E element) {
        // TODO: Write tests for this
    }
    
    // TODO: Determine if this applicable for the direction you choose
    public void addAtEnd(E element) {
        // TODO: Write tests for this
    }
    
    // TODO: Write tests for this
    public E get(int index) {
        return null;
    }
    
// TODO: Determine if this applicable for the direction you choose    
// TODO: Write tests for this
    public E getFirst() {
        return null;
    }
    
    // TODO: Determine if this applicable for the direction you choose
    // TODO: Write tests for this
    public E getLast() {
        return null;
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
    public boolean isEmpty() {
        return false;
    }
    
    public void clear() {
        // TODO: Write tests for this
    }
    
    public DoublyLinkedList() {
        //
    }
    
    private static class Node<E> {
        
        final E elem;
        
        // TODO: Determine if this applicable for the direction you choose
        Node<E> previous = null;
        
        // TODO: Determine if this applicable for the direction you choose
        Node<E> next = null;
        
        Node(E element) {
            this.elem = element;
        }
        
    }
    
}
