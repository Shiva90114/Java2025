
//Access Specifiers 
//  1  Private
//  2 default
//  3 public
//  4 protected
//
 class Parent {
   // default   int x = 10;
   // use private int x = 10;	 
         private int x = 10;

	 Parent() {
		 // super();
	 System.out.println("In Parent Constructor");
	 }
	   
	   
     void dispParent() {
     System.out.println(x);
     }



}
class Child extends Parent {           
    Child() {
	    // super();
         System.out.println("In Child Constructor");
         }
    
        

}

class Client {

public static void main(String[] args) {
            Child c = new Child();
	    //  c.dispChild();   error when private int 
	    // in child class
      /*  void  dispChild() {
         System.out.println(x);
         }*/
	      c.dispParent();
}
}

