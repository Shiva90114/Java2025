// same key value

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		IdentityHashMap hm = new IdentityHashMap(); 

		hm.put(128,"MSD");
		hm.put(new Integer(10),"Virat");
		hm.put(new Integer(10),"Rohit");
		hm.put(128,"Rahul");
                
	
	
		System.out.println(hm);
	}
}
//output-
//
//{128=Rahul, 10=Virat, 10=Rohit, 128=MSD}
