// List
//ArrayList
//
// Code -4
// iterator Next & Prevoius

import java.util.*;
class Demo {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
	
		System.out.println(al);
	
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());

		}
		// itr.hashPrevious
		while(itr.hasPrevious()){
		
			System.out.println(itr.previous());
		}
	
	}
}

