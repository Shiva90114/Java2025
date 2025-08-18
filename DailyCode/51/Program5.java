// ListIterator -List cursor - Bidirectional

import java.util.*;

class IteratorDemo{
	public static void main(String[] args){
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al); //[10,20,30,40,50 ]
		Iterator itr = al.iterator();
             
		while(itr.hasNext()){
		        if(itr.next() == 30){        // error: incomparable types: Object and int
			        itr.remove();
			}
		}
		 System.out.println(al); //[10,20,40,50 ]
	}



}
