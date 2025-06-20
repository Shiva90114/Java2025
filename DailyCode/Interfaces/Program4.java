// static keyword -Interface
interface Demo{
             static void fun(){
	     System.out.println("In fun");
	     }
	     void run();
	     
}

class DemoChild1 implements Demo {
                 public void run() {
		  System.out.println("In run-DemoChild1");
		  }

}
class DemoChild2 implements Demo {
                 public void run() {
                  System.out.println("In run-DemoChild2");
                  }

}
class Client {
       public static void main (String[] args){     
	Demo obj = new DemoChild1();
	obj.fun(); // error
	obj.run();
        Demo.fun();   // no error  
       }
} 
