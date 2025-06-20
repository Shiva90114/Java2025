class Parent {
	 int x = 10;
  Parent() {
      //  super();
      // this.x=10;	


	 
	  System.out.println("Parent Constructor");
  }
    void displayParent() {
              System.out.println(x);  // 10
           System.out.println(x);     //10
}

}
class Child extends Parent {
    int x = 20;
  Child() {
        //  super();
      // this.x=20;
          System.out.println("Child Constructor");
  }
     void displayChild() {
              System.out.println(x);           // 20
           System.out.println(super.x);   // Parent   // 10
   }

}
class Client {  
	 public static void main(String[] args){
	Child parentObj = new Child();    //  Para Con & Child Cons
	parentObj.displayParent();   //   10
	parentObj.displayChild();   //  20   & 10
	
	  
	 
	    
	 
	 }


}
                   //
//
///                                      error
