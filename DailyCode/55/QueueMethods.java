// UnBounded

import java.util.*;

class QueueMethods {

	public static void main(String[] args){
	
		Queue queue = new LinkedList();

		queue.add("Shiv");
		queue.add("Ram");
		queue.add("Yash");
		queue.add("Ravi");

		System.out.println(queue);
	
		// Offer
		queue.offer("Rahul");
		System.out.println(queue);

		// peek
                System.out.println(queue.peek());  // If empty print null

		// element
                System.out.println(queue.element());  // If empty print Exception

	
	}
}
