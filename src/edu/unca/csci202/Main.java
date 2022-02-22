package edu.unca.csci202;

public class Main {

	public static void main(String[] args) {

		LinkedDeque<Integer> q = new LinkedDeque<Integer>();
		
		q.addFirst(1);
		q.addLast(6);
		q.addFirst(2);
		q.addFirst(100);
		q.addFirst(10);
		q.addFirst(1);
		q.addFirst(9);
		q.addFirst(4);
		q.addLast(7);
		q.clear();
		System.out.println("Removed " + q.removeFirst());
		System.out.println("Get first: " + q.getFirst());
		System.out.println("Removed " + q.removeLast());
		System.out.println("Get last: " + q.getLast());
		System.out.println("removeFirst removed: " + q.removeFirstOccurrence(9));
		System.out.println("removeLast removed: " + q.removeLastOccurrence(1));
		q.printForward();
		q.printBackward();
	}

}
