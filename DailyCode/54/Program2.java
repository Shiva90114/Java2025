

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>(); 

		hm.put(7,"MSDhoni");
		hm.put(18,"Virat");
		hm.put(45,"Rohit");
                hm.put(1,"KLRahul");
	
		System.out.println(hm);
	}
}
