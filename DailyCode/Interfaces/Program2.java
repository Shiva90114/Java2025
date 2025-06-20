interface Demo{
             default void fun(){
	     System.out.println("In fun");
	     }
	     void run();
	     
}
class DemoChild1 implements Demo {
                public void fun() {
		System.out.println("In Fun");
		}
		public  void run() {
                System.out.println("In run-DemoChild1");
                }
}
class DemoChild2 implements Demo {
               public  void fun() {
                System.out.println("In Fun");
                }
               public   void run() {
                System.out.println("In run-DemoChild2  ");
                }
}
class Client {
            public static void main(String[] args){ 
	    Demo obj1 = new DemoChild1();
	     Demo obj2 = new DemoChild2();
             obj1.fun();
	     obj1.run();
 
	     obj2.fun();
	     obj2.run();
 	     
	    }

}
//
//output
//In fun
//In run-DemoChild1
//In fun
//In run-DemoChild2
//
