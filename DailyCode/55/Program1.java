// UnBounded
// PriorityQueue

import java.util.*;
class QueueDemo{
	public static void main(String[] args){
	
		PriorityQueue pq = new PriorityQueue();

		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		pq.offer(50);

		System.out.println(pq);//[10 30 20 50]

		while(!pq.isEmpty()){
		
			System.out.println(pq.poll());
		
		}
		/*
		 * output
		 *
		 * 10
                   20
                   30
                   50
		   
		   */
	
	}


}
