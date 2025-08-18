// Vector 

import java.util.*;

class VectorDemo{

	public static void main(String[] args){
	
		Vector<Integer> vObj= new Vector<Integer>();

		vObj.addElement(10);
		vObj.addElement(10);
		vObj.addElement(10);
		vObj.addElement(10);
		vObj.addElement(10);

		System.out.println(vObj.size());                // 5
		System.out.println(vObj.capacity());          // 10


		vObj.addElement(10);
                vObj.addElement(10);
                vObj.addElement(10);
                vObj.addElement(10);
                vObj.addElement(10);

                System.out.println(vObj.size());                // 10
                System.out.println(vObj.capacity());            //10

		 vObj.addElement(10);
		System.out.println(vObj.size());                // 11
                System.out.println(vObj.capacity());            // 20

	}

}
