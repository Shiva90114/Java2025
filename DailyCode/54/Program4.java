

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>(); 

		hm.put("CSK","MSD");
		hm.put("RCB","Virat");
		hm.put("MI","Rohit");
                hm.put("KKR","KLRahul");
	
	
		System.out.println(hm);
	}
}
//output-
//{CSK=MSD, RCB=Virat, MI=Rohit, KKR=KLRahul}
