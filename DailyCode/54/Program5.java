

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>(); 

		String str1 = new String("Core2Wb");
		String str2 = new String("Core2Wb");
		String str3 = new String("Core2Wb");
		hm.put(str1,"MSD");
		hm.put(str2,"Virat");
		hm.put(str3,"Rohit");
                
	
	
		System.out.println(hm);
	}
}
//output-
//
//{Core2Wb=Rohit}
