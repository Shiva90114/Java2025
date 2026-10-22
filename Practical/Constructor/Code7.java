// Code -7 Constructor
// Private variable cannot access from another classs
// Access
class Demo {

	private int x=10;//error
	Demo(){
	
		System.out.println("Demo Constructor");
		System.out.println(x);
	}
}

class DemoChild extends Demo{

	DemoChild() {
	
		System.out.println("Demo Child Constructor");
		System.out.println(x);//  x has private access in Demo
                                      //    System.out.println(obj1.x);
	}

}
class Client {

	public static void main(String[] args) {
	
		Demo obj1 = new Demo();
		System.out.println(obj1.x);//  x has private access in Demo
		DemoChild obj = new DemoChild();
		System.out.println(obj.x);// x has private access in Demo

	}
}
