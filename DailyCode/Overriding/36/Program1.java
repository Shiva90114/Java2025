class Parent {
       Parent(){
       
       System.out.println("Parent Constructor");
       }
        
       void fun(float y){

       System.out.println("Parent's fun");
      
       }
         void fun(int x){

       System.out.println("Parent's fun-Int");
       }


}
class Child extends Parent{
        
	Child(){

       System.out.println("Child Constructor");
       }

       void fun(){

       System.out.println("Child's fun");
       }


}
class Client {


public static void main(String[] args){
	Parent obj1 = new Parent();
	obj1.fun(20.5f);
	obj1.fun(10);
	Child obj2 = new Child();
            
	
	obj2.fun();




}

}

