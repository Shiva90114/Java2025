// List

import java.util.*;
class ListMethods {

	public static void main(String[] args){
	
	  	List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		List<Integer> ll2 = new ArrayList<Integer>();
                ll2.add(10);
                ll2.add(20);
                ll2.add(30);
                ll2.add(10);
	System.out.println(ll);	
        // void add(int index,Object o)
	ll.add(2,25);
	System.out.println(ll);
	// void addAll(int index,Collection c)
        ll.addAll(3,ll2);
	System.out.println(ll);
	// Object get(int index)
	// add
	System.out.println(ll.get(2));
	// Object remove(int index)
        ll.remove(2);
	System.out.println(ll);
	
	// Object set(int index,Object new)
	// remove & add 
	ll.set(2,120);
        System.out.println(ll);
      // int indexOf(Object o)
      // return only index
      System.out.println(ll.indexOf(10));//0
        // int lastindex(Object o)
      System.out.println(ll.lastIndexOf(10));  // 

      // ListIterator listerator
      ListIterator ltr = ll.listIterator();

      while(ltr.hasNext()){
           System.out.println(ltr.next());
      }
      while(ltr.hasPrevious()){
           System.out.println(ltr.previous());
      }
	}

}


