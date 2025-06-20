abstract class Parent{
       Parent() {
       System.out.println("Parent Constructor");
       
       }
       void career() {
       
       System.out.println("Doctor/Engineer");
       }
       abstract void marry();

}

class Client {
 public static void main(String[] args){
               Parent obj = new Parent();  // error: Parent is abstract; cannot be instantiated(object creting)
	      
 }

}
