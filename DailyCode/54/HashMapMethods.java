import java.util.*;

class HashMapMethods{

	public static void main(String[] args){
	
		HashMap hm = new HashMap();

		hm.put(7,"MSDhoni");
		hm.put(18,"Virat");
		hm.put(45,"Rohit");
		hm.put(8,"Jadeja");
		System.out.println(hm);  // use baket

		// get()
		 System.out.println(hm.get(4)); // null
		// remove()
		hm.remove(8);
		 System.out.println(hm);
		// containskey
		 System.out.println(hm.containsKey(18)); // true
		// containsValue()
		System.out.println(hm.containsValue(18)); // false
		// KeySet()
	        Set jerNo = hm.keySet();
		System.out.println(jerNo); // {,,}
		 System.out.println(jerNo.getClass());
		
		 Iterator itr = jerNo.iterator();
		 while(itr.hasNext()){
		    System.out.println(itr.next());
		  }
		


	        // Values()
	        // Set data = hm.values();  // error  collection cannot be convert into set
		Collection data = hm.values();
		 System.out.println(data);

		// enterySet()
		Set entry = hm.entrySet();
		System.out.println(entry);

		// iterator()
		Iterator itr2 = entry.iterator();
		/*while(itr2.hasNext()){
		
		    System.out.println(itr2.next());
		}	*/
		while(itr2.hasNext()){
                        //Map.Entry obj =itr2.next(); // error
			Map.Entry obj =(Map.Entry)itr2.next();
                System.out.println("Key : "+obj.getKey()+" Value : "+obj.getValue());
                }
	}

}
// output
//
/*
 {18=Virat, 7=MSDhoni, 8=Jadeja, 45=Rohit}
null
{18=Virat, 7=MSDhoni, 45=Rohit}
true
false
[18, 7, 45]
class java.util.HashMap$KeySet
18
7
45
[Virat, MSDhoni, Rohit]
[18=Virat, 7=MSDhoni, 45=Rohit]
Key : 18 Value : Virat
Key : 7 Value : MSDhoni
Key : 45 Value : Rohit
*/
