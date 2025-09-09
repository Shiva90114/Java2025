

// HashMap

import java.util.*;
class MapDemo{

	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>(); 

		hm.put(7,"MSD");
		hm.put(18,"Virat");
		hm.put(7,"MSDhoni");
		hm.put(45,"Rohit");
                hm.put(1,"KLRahul");
		hm.put(7,"Mahi");
	
		System.out.println(hm);
	}
}
//output-
//{7=Mahi, 18=Virat, 45=Rohit, 1=KLRahul}
