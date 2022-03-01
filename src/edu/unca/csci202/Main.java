package edu.unca.csci202;

public class Main {

	public static void main(String[] args) {

		LinkedDeque<Integer> q = new LinkedDeque<Integer>();
		
		q.addFirst(2);
		q.addLast(3);
		q.addFirst(1);
		q.printForward();
//		System.out.println("Removed " + q.removeFirst());
//		q.printForward();
//		System.out.println("Get first: " + q.getFirst());
//		q.printForward();
//		System.out.println("Removed " + q.removeLast());
//		q.printForward();
//		System.out.println("Get last: " + q.getLast());
//		q.printForward();
		System.out.println("removeFirstOccurence removed: " + q.removeFirstOccurrence(2));
		q.printForward();
		System.out.println(q.getFirst());
//		System.out.println("removeLastOccurence removed: " + q.removeLastOccurrence("Eigth"));
//		q.printForward();
	}

}
