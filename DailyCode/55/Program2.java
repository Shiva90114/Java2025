// UnBounded
// PriorityQueue

import java.util.*;
class QueueDemo{
	public static void main(String[] args){
	
		//PriorityQueue pq = new PriorityQueue();
		PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());

		pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Badhe");

		System.out.println(pq);//[Rahul ,Badhe,Kanha,Ashish]

		while(!pq.isEmpty()){
		
			System.out.println(pq.poll());
		
		}
	
	
	}


}
