// Code -8 
// Constructor
// Access
class Demo {

	int x =10;
	Demo(){
	
		System.out.println("Demo Constructor");
	}
}
class DemoChild extends Demo {

        DemoChild(){

                System.out.println("DemoChild Constructor");
		System.out.println(x);
        }
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();

	}
}
