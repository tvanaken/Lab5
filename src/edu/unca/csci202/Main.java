package edu.unca.csci202;

public class Main {

	public static void main(String[] args) {

		LinkedDeque<String> q = new LinkedDeque<String>();
		
		q.addFirst("Two");
		q.addLast("Three");
		q.addFirst("One");
		q.printForward();
//		System.out.println("Removed " + q.removeFirst());
//		q.printForward();
//		System.out.println("Get first: " + q.getFirst());
//		q.printForward();
//		System.out.println("Removed " + q.removeLast());
//		q.printForward();
//		System.out.println("Get last: " + q.getLast());
//		q.printForward();
		System.out.println("removeFirstOccurence removed: " + q.removeFirstOccurrence("Two"));
		q.printForward();
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
//		System.out.println("removeLastOccurence removed: " + q.removeLastOccurrence("Eigth"));
//		q.printForward();
	}

}
