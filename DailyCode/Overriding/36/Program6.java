class Parent{
          int  fun(int x) {
	  
	  System.out.println("Parent-fun");
	  return 10;
	  }


}
class Child extends Parent {
      //   void fun(int y) // error   // cannot overrie
     
      int fun(int y)	{
	 
	 System.out.println("Child-fun ");
          return 100; 	 
      }
	       
        
}
class Client {
    public static void main(String[] args){
	Parent obj = new Child();
	obj.fun(10);
         
    }
}
