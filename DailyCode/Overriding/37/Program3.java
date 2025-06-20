

class Parent {

                  public void fun() {            //  only void fun()
                  System.out.println("Parent-fun");
                  
}

}
class Child extends Parent{

                 void fun() {          // use public void  fun()    // error
				       // attempting to weakeraccess privleges; was public
				          
                  System.out.println("Child-fun");
                  
} 


}
class Client {
 public static void main(String[] args){
 
 
 Parent obj = new Child();
 obj.fun();}


}

