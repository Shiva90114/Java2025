import java.util.*;

class EnumCursor{

	public static void main(String[] args){
	
		Vector<String> v = new Vector<String>();
		v.addElement("Shiv");
		v.add("Ram");
		v.add("Ravi");
		v.add("Raju");
	       
		System.out.println(v);

		//Iterator itr = v.iterator();
		
		ListIterator itr = v.listIterator();
		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
		 while(itr.hasPrevious()){

                        System.out.println(itr.previous());
                }
	}

}
