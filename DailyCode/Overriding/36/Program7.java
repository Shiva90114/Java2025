class Parent{
          //       condition 1st int  fun(int x) {
	  Object fun(int x) {
	  System.out.println("Parent-fun");
	  return new Object();
	  }


}
class Child extends Parent {
    
     
//      float fun(int y)  // error
     String fun(int y) {    //error
	 
	 System.out.println("Child-fun ");
          return "Shashi"; 	 
      }
	       
        
}
class Client {
    public static void main(String[] args){
	Parent obj = new Child();
	obj.fun(10);
         
    }
}
