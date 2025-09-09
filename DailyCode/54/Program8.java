// same key value

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		IdentityHashMap hm = new IdentityHashMap(); 

		hm.put(128,"MSD");
		hm.put(10,"Virat");
		hm.put(10,"Rohit");
		hm.put(128,"Rahul");
                
	
	
		System.out.println(hm);
	}
}
//output-
//
//{10=Rohit, 128=Rahul, 128=MSD}
