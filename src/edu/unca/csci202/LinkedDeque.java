package edu.unca.csci202;

import java.util.NoSuchElementException;

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
    
    /**
     * Adds a new element to the head of this deque and reassigns the
     * pointers for next and previous on surrounding nodes.
     * @param element the element to insert at the head of this deque
     */
    public void addFirst(E element) {
    	
    	DNode<E> newNode = new DNode<E>(element);
    	DNode<E> first = head.getNext();
    	if (isEmpty()) {
    		tail.setPrevious(newNode);
    		newNode.setNext(tail);
    	}
    	head.setNext(newNode);
		newNode.setPrevious(head);
		newNode.setNext(first);
		first.setPrevious(newNode);
    }
    
    /**
     * Removes and returns the head element of this deque and reassigns the
     * pointers for next and previous on surrounding nodes.
     * @return the first element of this deque
     * @throws NoSuchElementException if this deque is empty
    */
    public E removeFirst() {
    	
    	try {
    		
    		if (isEmpty()) {
    			throw new NoSuchElementException();
    		}
    	} catch (NoSuchElementException e) {
    		return null;
    	}
    	DNode<E> first = head.getNext();
    	DNode<E> second = first.getNext();
    	head.setNext(second);
    	second.setPrevious(head);
        return first.getData();
    }
    
    /**
     * @return the first element of this deque.
     * @throws NoSuchElementException if this deque is empty.
    */
    public E getFirst() {
    	
    	try {
	    	if (isEmpty()) {
	    		throw new NoSuchElementException();
	    	}
    	} catch (NoSuchElementException e) {
    		return null;
    	}
        return head.getNext().getData();
    }
    
    /**
     * Traverses the deque from head to tail, then removes the 
     * first occurrence of a value in the deque.
     * @param element the value to be removed from this deque.
     * @return true if an object is removed
    */
    public boolean removeFirstOccurrence(E element) {
    	
    	DNode<E> current = head.getNext();
    	while (current != tail) {
    		if (current.getData().equals(element)) {
    			DNode<E> previous = current.getPrevious();
    			DNode<E> next = current.getNext();
    			
    			previous.setNext(next);
    			next.setPrevious(previous);
    			return true;
    		} else {
    			current = current.getNext();
    		}
    	}
    		
        return false;
    }
    
    /**
     * Adds a new element to the tail of this deque and reassigns the
     * pointers for next and previous on surrounding nodes.
     * @param element the element to insert at the tail of this deque
    */
    public void addLast(E element) {
    	
    	DNode<E> newNode = new DNode<E>(element);
    	DNode<E> last = tail.getPrevious();
    	if (isEmpty()) {
    		head.setNext(newNode);
    		newNode.setPrevious(head);
    	}
    	tail.setPrevious(newNode);
		newNode.setNext(tail);
		newNode.setPrevious(last);
		last.setNext(newNode);
    }
    
    /**
     * Removes and returns the tail element of this deque and reassigns the
     * pointers for next and previous on surrounding nodes.
     * @return the tail element of this deque
     * @throws NoSuchElementException if this deque is empty
    */
    public E removeLast() {
    	
    	try {
    		if (isEmpty()) {
    			throw new NoSuchElementException();
    		}
    	} catch (NoSuchElementException e) {
    		return null;
    	}
    	DNode<E> last = tail.getPrevious();
    	DNode<E> secondLast = last.getPrevious();
    	tail.setPrevious(secondLast);
    	secondLast.setNext(tail);
    	
        return last.getData();
    }
    
    /**
     * @return the last element of this deque
     * @throws NoSuchElementException if this deque is empty
    */
    public E getLast() {
    	
    	try {
	    	if (isEmpty()) {
	    		throw new NoSuchElementException();
	    	}
    	} catch (NoSuchElementException e) {
    		return null;
    	}
        return tail.getPrevious().getData();
    }
    
    /**
     * Traverses the deque from tail to head, then removes the 
     * first occurrence of a value in the reverse deque.
     * @param element the value to be removed from this deque.
     * @return true if the given object is removed
    */
    public boolean removeLastOccurrence(E element) {
    	
    	DNode<E> current = tail.getPrevious();
    	while (current != head) {
    		if (current.getData().equals(element)) {
    			DNode<E> next = current.getNext();
    			DNode<E> previous = current.getPrevious();
    			next.setPrevious(previous);
    			previous.setNext(next);
    			
    			return true;
    		} else {
    			current = current.getPrevious();
    		}
    	}
    		
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

