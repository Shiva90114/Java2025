// forEach loop
// Change  Version 1.8 to above 10
import java.util.*;

class IteratorDemo{
	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);  // [10,20,30,40,50]
		for(var data : al ){
           		System.out.println(data);
		}
	}



}
