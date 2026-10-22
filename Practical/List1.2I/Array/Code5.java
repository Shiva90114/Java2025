// List
//ArrayList
//
// Code -5
// vector

import java.util.*;
class EnumCursor {

	public static void main(String[] args) {
	
		Vector<String> v = new Vector<String>();
		// v.add(10); // error String
		v.addElement("Shiva");
		v.addElement("Ram");
	
		System.out.println(v);
	
		Enumeration itr = v.elements();
		while(itr.hasMoreElements()) {
		
			System.out.println(itr.nextElement());

		}
	
	}
}

