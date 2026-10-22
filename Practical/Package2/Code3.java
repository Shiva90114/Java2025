// Code 3
// Package
// Protected  keyword
import accessDefault.*;

class DemoChild extends Demo {

	DemoChild() {
	
		System.out.println(y+" "); // error
		System.out.println("DemoChild Constructor");
	}
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();
	}
}

