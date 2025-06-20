class Parent{
   Parent(){
	 //invokespecial -> object() 
	 super(); 
    System.out.println("Parent constructor");
   
   }
}
class Child extends Parent {
	Child(){
	System.out.println("Child Constructor");
	}

}
class Client{
        public static void main(String[] args){
	Parent obj1 = new Parent();
	Child obj2 = new Child();
	}
}
