// Array

import java.util.*;
class ArrayLastDemo{

	public static void main(String[] args){
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shiv");
		list.add("Ram");
		list.add("Raju");
		System.out.println(list);

		// public boolean add()
	        System.out.println(list.size());
		// public void trimToSize();
		//reduce size
		list.trimToSize();
		System.out.println(list);
		// public boolean contans(Object o)
                // Check true or false
		System.out.println(list.contains("Ram"));
	       // increase capcity
	       list.ensureCapacity(10);	
	}
}
