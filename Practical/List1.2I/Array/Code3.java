// List
//ArrayList
//
// Code -3
// iterator

import java.util.*;
class Demo {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
	
		System.out.println(al);
	
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());

		}
	
	}
}

