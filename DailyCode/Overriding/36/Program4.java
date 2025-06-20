class Parent{
          void fun() {
	  
	  System.out.println("Parent-fun");
	  }


}
class Child extends Parent {
         void fun() {
	 
	 System.out.println("Child-fun ");
	 }
	        void run() {

         System.out.println("Child-run");
         }
        
}
class Client {
    public static void main(String[] args){
	     
//    Child obj3 = new Parent();      //erroe // incompatiabe
      Parent obj3 = new Child();
    obj3.fun();
 //   obj3.run();   // error          // cannot find symbol
    }
}
