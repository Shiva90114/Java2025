abstract class Parent{
       Parent() {
       System.out.println("Parent Constructor");
       
       }
       void career() {
       
       System.out.println("Doctor/Engineer");
       }
       abstract void marry();

}
class Child extends Parent{
    
   
       void marry() {

       System.out.println("Disha Patni");
      }

}
class Client {
 public static void main(String[] args){
               Child obj = new Child();  
	      obj.career();
	      obj.marry();
	       
 }

}
