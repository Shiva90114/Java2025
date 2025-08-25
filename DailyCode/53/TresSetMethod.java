import java.util.*;

class TreeSetDemo1{
public static void main(String[] args){


	TreeSet ts = new TreeSet();

	ts.add("Tushar");
	ts.add("Madhur");
	ts.add("Nitin");
	ts.add("Shridhar");

	System.out.println(ts);
// First()

	System.out.println(ts.first());// Madhur
//last()

	System.out.println(ts.last()); // Tushar

	// lower(object)
	System.out.println(ts.lower("Shridhar")); // Nitin
        //floor(Object)

	System.out.println(ts.floor("Tushar"));
	//higher(object)
	 System.out.println(ts.higher("Shridhar")); // Tushar

	 //celling(object)
         System.out.println(ts.ceiling("Tushar")); // Tushar

	 // Sorted Set
	 // subSet(E,E)  start end
	 System.out.println(ts.subSet("Madhur","Tushar")); 
	 // headSet(E)

	 System.out.println(ts.headSet("Nitin"));
	 // tailSet(E)
	 System.out.println(ts.tailSet("Nitin"));
	 //Navigable set
	 //subSet(E,bool,E,bool)
	 System.out.println(ts.subSet("Madhur",true,"Tushar",true));
	 //headSet(E,bool)
	 System.out.println(ts.headSet("Nitin",true));
	 //tailSet(E,bool)

	 System.out.println(ts.tailSet("Nitin",false));
}








}
