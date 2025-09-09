// key is unique

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		IdentityHashMap hm = new IdentityHashMap(); 

		
		hm.put(10,"MSD");
		hm.put(10,"Virat");
		hm.put(10,"Rohit");
                
	
	
		System.out.println(hm);
	}
}
//output-
//
//{10=Rohit}
