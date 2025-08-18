// Stack 

import java.util.*;

class StackMethodsDemo{

	public static void main(String[] args){
	Stack s = new Stack();
	//public E push(E items);
        s.push(10);
        s.push(20);
	s.push(30);
	s.push(40);
 
	System.out.println(s);

	// public synchronized E pop();
	System.out.println(s.pop());

	//  public synchronized E peek();
	System.out.println(s.peek());

	//   public boolean empty();
        System.out.println(s.empty());	
	//    public synchronized int search(Object o);
	System.out.println(s.search(20));
	}
}
