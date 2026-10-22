// Code - 5
// Package - protected
//

import defaultprotected.*;
class DemoChild extends Demo {

	DemoChild(){
	
		System.out.println("DemoChild Constructor");
	//	System.out.println(x); // error // default
		System.out.println(y); // protected
	}
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();
		// System.out.println(obj.y); // Protected Demo
	}
}
