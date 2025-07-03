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
       void gun() {
                            System.out.println("Child  gun");
       }
       public void run(int x) {
	         gun();
		 System.out.println("Child run-int");
	}

}
class Client {

	public static void main(String[] args) {
	
	
		
		Parent obj3 = new Child();
		obj3.fun();            // Parent fun
		//obj3.gun();          // Child gun
		obj3.run(30);          // Child run-int 
	}

}
/*
 Parent Constructor
Child Constructor
Parent fun
Child  gun
Child run-int
*/
