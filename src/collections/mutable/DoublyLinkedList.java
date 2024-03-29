/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.mutable;

import java.util.Iterator;

/**
 * EXERCISE: Create a doubly-linked list. A stub is provided for a nested static 
 * class.
 * @param <E> The type of elements the list will hold.
 * @author Alonso del Arte
 */
public class DoublyLinkedList<E> implements Iterable<E> {
    
    private boolean hasElements = false;
    
    private int elemCount = 0;
    
    private Node<E> start = null;
    
    private Node<E> finish = null;
    
    private void addVeryFirst(E element) {
        Node<E> node = new Node<>(element);
        this.start = node;
        this.finish = node;
        this.elemCount = 1;
        this.hasElements = true;
    }
    
    public void addAtBeginning(E element) {
        if (element == null) {
            String excMsg = "Can't add null at beginning nor end of list";
            throw new NullPointerException(excMsg);
        }
        if (this.elemCount == 0) {
            this.addVeryFirst(element);
        } else {
            Node<E> node = new Node<>(element);
            node.next = this.start;
//            this.start.previous = node;
            this.start = node;
            this.elemCount++;
        }
    }
    
    public void addAtEnd(E element) {
        if (element == null) {
            String excMsg = "Can't add null at beginning nor end of list";
            throw new NullPointerException(excMsg);
        }
        if (this.elemCount == 0) {
            this.addVeryFirst(element);
        } else {
            Node<E> node = new Node<>(element);
            node.previous = this.finish;
            this.finish.next = node;
            this.finish = node;
            this.elemCount++;
        }
    }
    
    // TODO: Write tests for this
    public E get(int index) {
        return null;
    }
    
    public E getFirst() {
        return this.start.elem;
    }
    
    public E getLast() {
        return this.finish.elem;
    }
    
    public int size() {
        return this.elemCount;
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
    
    // TODO: Write tests for this
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
            
        };
    }
    
    @Override
    public String toString() {
        String intermediate = "[";
        boolean keepGoing = this.elemCount > 0;
        Node<E> curr = this.start;
        while (keepGoing) {
            intermediate += curr.elem.toString();
            keepGoing = curr.next != null;
            if (keepGoing) {
                intermediate += ", ";
                curr = curr.next;
            }
        }
        return intermediate + ']';
    }
    
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    @Override
    public int hashCode() {
        return Integer.MAX_VALUE;
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
