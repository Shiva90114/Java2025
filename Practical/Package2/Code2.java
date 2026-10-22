// Code 2
// Package
// error
import accessDefault.*;

class DemoChild extends Demo {

	DemoChild() {
	
		System.out.println(x); // error
		System.out.println("DemoChild Constructor");
	}
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();
	}
}
/*error
 * error: x is not public in Demo; cannot be accessed from outside package
                System.out.println(x);
 * */
