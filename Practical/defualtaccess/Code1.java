// Code1.java
//

import access.*;
class DemoChild extends Demo {

	DemoChild(){
	
		System.out.println("DemoChild Constrcutor");
	}

}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();
	}
}
