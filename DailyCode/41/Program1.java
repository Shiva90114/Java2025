// Abstraction
// 1.Abstraction Class
// 2.Interface
abstract class Demo {

	abstract void fun();
        
      	void run() {
	System.out.println("In run");
	}
}
class DemoChild extends Demo {
                void fun() {
		System.out.println("In fun");
		}
}
class Client {

	public static void main(String[] args){
	
		Demo obj = new DemoChild();
		obj.fun();
		obj.run();
	
	}

}
//output
//
//In fun
//In run
