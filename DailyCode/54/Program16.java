// Dictionary

import java.util.*;
class DictionaryDemo{

	public static void main(String[] args){
	
		Dictionary obj = new Hashtable(25);

		obj.put(7,"MSDhoni");
		obj.put(18,"Virat");
		obj.put(45,"Rohit");
		obj.put(1,"KLRahul");

	
		System.out.println(obj);

		Enumeration itr1 = obj.elements();
		while(itr1.hasMoreElements()){
		System.out.println(itr1.nextElement());
		}
		Enumeration itr2 = obj.keys();
                while(itr2.hasMoreElements()){
                System.out.println(itr2.nextElement());
                }


	}
}
// output
//
// {18=Virat, 7=MSDhoni, 1=KLRahul, 45=Rohit}
