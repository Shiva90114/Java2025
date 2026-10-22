// Code 1
// Package

import accessDefault.*;

class DemoChild extends Demo {

	DemoChild() {
	
		System.out.println("DemoChild Constructor");
	}
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();
	}
}
/*
1 *error when not use import
  error : cannot access Demo;

 
 * */
