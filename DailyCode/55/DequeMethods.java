// Deque


import java.util.*;

class DequeMethods {

	public static void main(String[] args){
	
		Deque dqObj = new ArrayDeque();

		dqObj.offer(10);
		dqObj.offer(20);
		dqObj.offer(30);

		System.out.println(dqObj);

		// offerFirst
	          dqObj.offerFirst(5);

		System.out.println(dqObj);

		// offerLast
		dqObj.offerLast(40);
		System.out.println(dqObj);

		//pollFirst
		dqObj.pollFirst();
		System.out.println(dqObj);

		// pollLast
		dqObj.pollLast();
		System.out.println(dqObj);

		// iterator
		Iterator itr = dqObj.iterator();

		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		
		}
		                                                                                                                                                   
	}
}
