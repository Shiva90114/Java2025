import java.util.*;

class EnumCursor{

	public static void main(String[] args){
	
		Vector<String> v = new Vector<String>();
		v.addElement("Shiv");
		v.add("Ram");
		v.add("Ravi");
		v.add("Raju");
	       
		System.out.println(v);

		Enumeration itr = v.elements();
		while(itr.hasMoreElements()){
			System.out.println(itr.nextElement());
		
		}
		
		
	}

}
