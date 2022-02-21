package edu.unca.csci202;

public class Main {

	public static void main(String[] args) {

		LinkedDeque<Integer> q = new LinkedDeque<Integer>();
		
		q.addFirst(1);
		q.addLast(6);
		q.addFirst(2);
		q.addLast(7);
		System.out.println("Removed " + q.removeFirst());
		System.out.println("Get first: " + q.getFirst());
		System.out.println("Removed " + q.removeLast());
		System.out.println("Get last: " + q.getLast());
		q.printForward();
		q.printBackward();
//		q.getFirst();
//		q.removeFirstOccurrence(2);
//		q.addLast(5);
//		q.getLast();
//		q.removeLastOccurrence(6);
//		q.printForward();
	}

}
