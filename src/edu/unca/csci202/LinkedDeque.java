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
    
    public E removeFirst() {
    	
    	DNode<E> first = head.getNext();
    	DNode<E> second = first.getNext();
    	head.setNext(second);
    	second.setPrevious(head);
    	
        return first.getData();
    }
    
    public E getFirst() {
    	
        return head.getNext().getData();
    }
    
    public boolean removeFirstOccurrence(E element) {
    	
    	DNode<E> current = head.getNext();
    	for (int i = 0; current != tail; i++) {
    		if (current.getData() == element) {
    			
    			
    			return true;
    		}
    	}
    		
        return false;
    }
    
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
    
    public E removeLast() {
    	
    	DNode<E> last = tail.getPrevious();
    	DNode<E> secondLast = last.getPrevious();
    	tail.setPrevious(secondLast);
    	secondLast.setNext(tail);
    	
        return last.getData();
    }
    
    public E getLast() {
    	
        return tail.getPrevious().getData();
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

