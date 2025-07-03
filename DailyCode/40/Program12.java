//Inheritance 
//

class Parent {
                   int x =10;
		   Parent() {
		   
			   System.out.println("Parent Constructor");
		   }
		   void fun() {
		            System.out.println("Parent fun");
		   }
		   void run(int x) {
		   
			   System.out.println("Parent run-int");
		   }
		   
}
class Child extends Parent {
	int y = 20;
	 
	Child() {

                           System.out.println("Child Constructor");
                   }
	public void run(int x) {
	
		 System.out.println("Child run-int");
	}

}
class Client {

	public static void main(String[] args) {
	
	
		Parent obj1 = new Parent();
		obj1.fun();            // Parent fun
		obj1.run(10);          // Parent run

		Child obj2 = new Child();                                                                                                    obj2.fun();            // Parent fun
		obj2.run(20);          // Child run-int
	        
		Parent obj3 = new Child();
		obj3.fun();            // Parent fun
		obj3.run(30);          // Child run-int 
	}

}

/*
Parent Constructor
Parent fun
Parent run-int
Parent Constructor
Child Constructor
Parent fun
Child run-int
Parent Constructor
Child Constructor
Parent fun
Child run-int

*/
