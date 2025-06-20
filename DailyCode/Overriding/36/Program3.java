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
	    //  Parent obj = new Child();
	//      obj.fun();
    // output-----Child-fun
	   Parent obj = new Parent();
	   obj.fun();
	 //  obj.run();            // error
    Child obj2 = new Child();
    obj2.fun();
    obj2.run();
        
    Parent obj3 = new Child();
    obj3.fun();
  //  obj3.run();     // error        // cannot find symbol
    }
}
