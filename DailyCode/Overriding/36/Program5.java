class Parent{
          void fun(int x) {
	  
	  System.out.println("Parent-fun");
	  }


}
class Child extends Parent {
         void fun(int y) {
	 
	 System.out.println("Child-fun ");
	 }
	       
        
}
class Client {
    public static void main(String[] args){
	Parent obj = new Child();
	obj.fun(10);
         
    }
}
