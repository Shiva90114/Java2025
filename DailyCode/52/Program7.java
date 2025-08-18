// LinkedList

import java.util.*;
class LinkedListDemo{

	public static void main(String[] ars){
	
		LinkedList<String> ll = new LinkedList<String>();
	
		ll.add("Shiva");
		ll.add("Ram");
		ll.add("Raju");
		ll.add("Yash");
		System.out.println(ll);

		// public void addFirst(E e)
		ll.add("Rahul");
		System.out.println(ll);

		//public void addLast(E e)
		ll.add("Ram");                                                                                                                                              System.out.println(ll);
	    
		// public E getFirst();                                                                                                                          
	        System.out.println(ll.getFirst());

		// public E getLast();
	        System.out.println(ll.getLast());

		// public E removeFirst();
		 ll.removeFirst();

		  // public E removeLast();
		  ll.removeLast();
		   System.out.println(ll);

		  // public E peekFirst(); 
                  // print
		  ll.peekFirst();
                  System.out.println(ll);

		  // public E peekLast();
                  ll.peekLast();
		  System.out.println(ll);

		  // public E pollFirst();
		  ll.pollFirst();
		  System.out.println(ll);
		  
		  // public E pollFirst();
		  ll.pollLast();
                  System.out.println(ll);

	}
}
