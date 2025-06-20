class Parent {
       Parent(){
       
       System.out.println("Parent Constructor");
       }
        
       void career(){

       System.out.println("Doctor/Enginner");
     
       }
       void marry(){
       System.out.println("Alia Bhat");
       }
         


}
class Child extends Parent{
        
	Child(){

       System.out.println("Child Constructor");
       }

        void career(){

       System.out.println("Youtuber");

       }
       void marry(){

       System.out.println("Disha Patni");

       }

 }
class Client {


public static void main(String[] args){
	Parent obj1 = new Parent();
	obj1.career();
	obj1.marry();
	
	Child obj2 = new Child();
        obj2.career();
        obj2.marry();
         

	Parent obj3 = new Child();
	  
        obj3.career();
        obj3.marry();
}
}

