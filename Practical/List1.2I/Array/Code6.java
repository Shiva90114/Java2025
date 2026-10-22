// List
//
//
// Code -6
// hashTable - key-value pairs

import java.util.*;
class Demo {

	public static void main(String[] args) {
	
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		ht.put(101, "Shiva");
                ht.put(102, "Ram");
                ht.put(103, "Shyam");
	
		System.out.println(ht);
		System.out.println(ht.get(101));
		System.out.println(ht.containsKey(102)); // Check
		ht.remove(103);
		Enumeration<Integer> keys = ht.keys();

                while (keys.hasMoreElements()) {
                        Integer key = keys.nextElement();
                        System.out.println(key + " = " + ht.get(key));
		}
	
	}
}

