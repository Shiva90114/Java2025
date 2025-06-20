

class Parent {

              static void fun() {            
                  System.out.println("Parent-fun");
                  
}

}
class Child extends Parent{

            static void fun() {           // error 
                  System.out.println("Child-fun");
                  
} 


}
class Client {
 public static void main(String[] args){
 
 
 
                   Parent.fun();        //error
 }


}

