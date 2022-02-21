package edu.unca.csci202;

/**
 * implementation of linked double-ended queue
 * uses dummy (aka sentinel) nodes at head and tail
 */
public class LinkedDeque<E> implements Deque<E> {
    
    private DNode<E> head;
    private DNode<E> tail;
    
    // Creates both a dummy head and a dummy tail.
    public LinkedDeque() {
        head = new DNode<>();
        tail = new DNode<>();
        head.setNext(tail);
        tail.setPrevious(head);
    }
    
    public boolean isEmpty() {
        return head.getNext() == tail;
    }
    
    public void clear() {
        head.setNext(tail);
        tail.setPrevious(head);
    }
    
    // IMPLEMENT THESE METHODS
    public void addFirst(E element) {
    	
    	DNode<E> newNode = new DNode<E>(element);
    	if (isEmpty()) {
    		tail.setPrevious(newNode);
    		newNode.setNext(tail);
    	} else {
    		head.setNext(newNode);
    	}
    	newNode.setPrevious(head);
    }
    
    public E removeFirst() {
        return null;
    }
    
    public E getFirst() {
    	
        return null;
    }
    
    public boolean removeFirstOccurrence(E element) {
        return false;
    }
    
    public void addLast(E element) {
    }
    
    public E removeLast() {
        return null;
    }
    
    public E getLast() {
        return null;
    }
    
    public boolean removeLastOccurrence(E element) {
        return false;
    }
    
    // methods to print the deque are provided:
    public void printForward() {
        System.out.println("The deque printed forward:");
        DNode current = head.getNext();
        while (current != tail) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }
    
    public void printBackward() {
        System.out.println("The deque printed backward:");
        DNode current = tail.getPrevious();
        while (current != head) {
            System.out.println(current.getData());
            current = current.getPrevious();
        }
        System.out.println();
    }
    
}

