// Vector 

import java.util.*;

class VectorMethods{

	public static void main(String[] args){
	
		Vector<Integer> v= new Vector<Integer>();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);       
                System.out.println(v.capacity());    
	// public synchronized void setSize(int newSize);
//	v.setSize(15);
	//System.out.println(v.capacity());   // 20
					    //  if 25 then 25 because formula
   
	//  public synchronized E elementAt(int index);
	System.out.println(v.elementAt(2));
	//  public synchronized E firstElemen();
	System.out.println(v.firstElement());
	
	//  public synchronized E lastElemen();
	System.out.println(v.lastElement());
	
	//  public synchronized void setSize(E obj,int index);
	v.setElementAt(35,2);
	System.out.println(v);
	//  public synchronized void setElementAt(int index);
	// public synchronized void removeElementAt(int index);
	// public synchronized void insertElementAt(E obj,int index);
	//public synchronized void removeAllElements();
	//Enumeration
	Enumeration itr = v.elements();
	while(itr.hasMoreElements()){
	
		System.out.println(itr.nextElement());
	}

	}

}
