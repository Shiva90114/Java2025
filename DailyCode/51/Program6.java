// Iterator 
// not print last no. repeat
import java.util.*;

class IteratorDemo{
	public static void main(String[] args){
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
	// 	Iterator itr = al.iterator();
                ListIterator itr = al.listIterator();
		while(itr.hasNext()){
		        System.out.println(itr.next());
		
		}
		itr.previous();
		while(itr.hasPrevious()){
                        System.out.println(itr.previous());
                }
	}



}
