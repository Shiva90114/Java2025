class Parent {
	 int x=10;
  Parent(){
        


	 
	  System.out.println("Parent Constructor");
  }
   void displayParent(){
   System.out.println(x);

   }
}
class Child extends Parent {
  Child(){
 
          System.out.println("Child Constructor");
  }
     void displayChild(){
              System.out.println(x);

   }

}
class Client {  
	 public static void main(String[] args){
	 Parent parentObj = new Parent();
	 parentObj.displayParent();    // Parent Constructor
				  // 10
	  
	 Child childObj = new Child();
	 
	 childObj.displayChild();
	  childObj.displayParent();
	 // Parent() - >Object
	  
	 // Child() - >Parent ->Object()
	 }

}

